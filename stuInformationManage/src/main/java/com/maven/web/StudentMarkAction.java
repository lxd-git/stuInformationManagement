package com.maven.web;

import com.maven.entity.Student;
import com.maven.entity.StudentMark;
import com.maven.service.StudentMarkService;
import com.maven.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */
@Controller
@RequestMapping("/studentMarkAction")
public class StudentMarkAction {
    @Resource(name = "studentMarkService")
    private StudentMarkService studentMarkService;
    @Resource(name = "studentService")
    private StudentService studentService;

    //查询学生成绩的方法
    @RequestMapping("/findStudentMarkList")
    public String findStudentMarkList(ModelMap map){
        List list = studentMarkService.findStudentMarkList();
        map.addAttribute("studentMarkList",list);
        return "stuMark";
    }

    //++++++++=添加学生成绩
    //先异步查询出学生的名字
    @RequestMapping("/findStudent")
    @ResponseBody
    public List<Student> findStudent(){
        String hql="from Student";
        return studentService.findStudentList(hql);
    }
    //执行添加的方法
    @RequestMapping("/addStudentMark")
    public String addStudentMark(StudentMark stum, RedirectAttributes attr){
        System.out.println("进入方法");
        if (stum!=null){
            if (stum.getS().getS_no()==0){
                attr.addAttribute("rtype","2");
                return "redirect:/addStudentMark.jsp";
            }
            if (studentMarkService.addStudentMark(stum)){
                attr.addAttribute("rtype","1");
            }else {
                attr.addAttribute("rtype","0");
            }
        }
        return "redirect:/addStudentMark.jsp";
    }

    //++++++++++++++++++++++修改成绩信息+++++++++
    //先查询出所有成绩
    @RequestMapping("/findStudentMarkList2")
    public String findStudentMarkList2(ModelMap map){
        List list=studentMarkService.findStudentMarkList();
        map.addAttribute("studentMarkList2",list);
        return "updateStudentMark";
    }




    //+++++++++++++++++++删除成绩的方法
    @RequestMapping("/deleteStudentMark")
    public String deleteStudentMark(ModelMap map,StudentMark stum){
//        System.out.println("进入删除的方法"+stum.getSm_no());
        studentMarkService.deleteStudentMark(stum);
        List list=studentMarkService.findStudentMarkList();
        map.addAttribute("studentMarkList2",list);
        return "updateStudentMark";
    }

    public void setStudentMarkService(StudentMarkService studentMarkService) {
        this.studentMarkService = studentMarkService;
    }
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
