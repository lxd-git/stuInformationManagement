package com.maven.web;

import com.maven.entity.Student;
import com.maven.service.StudentClassService;
import com.maven.service.StudentMarkService;
import com.maven.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Controller
@RequestMapping("/studentAction")
public class StudentAction {
    @Resource(name = "studentService")
    private StudentService studentService;
    @Resource(name = "studentClassService")
    private StudentClassService studentClassService;
    @Resource(name = "studentMarkService")
    private StudentMarkService studentMarkService;

    private Student student;

    //查询学生信息的方法
    @RequestMapping("/findStudentList")
    public String findStudentList(ModelMap map){
       List list = studentService.findStudentList();
       map.addAttribute("studentList",list);
//       System.out.println(list);
       return "stuInfomation";
    }

    //++++++++++++++++++++根据班级姓名进行模糊查询++++++++++++++++++++++++++
    @RequestMapping("/findStudentList_1")
    public String findStudentList_1(ModelMap map,Student stu){
//        System.out.println(stu.getSc().getSc_no()+","+stu.getS_name());
        int stuclass=stu.getSc().getSc_no();
        String stuname=stu.getS_name();
        List list=studentService.findStudentList(stuclass,stuname);
        map.addAttribute("studentList",list);
        System.out.println("返回后的数据："+list);
        return "stuInfomation";
    }

    //添加的方法
    @RequestMapping("/addStudent")
    public String addStudent(Student stu, RedirectAttributes attr){
//        System.out.println("进入");
        if(stu!=null){
            if(stu.getSc().getSc_no() == 0){
                attr.addAttribute("rtype",'2');
                return "redirect:/addStudent.jsp";
            }
            if (studentService.addStudent(stu)){
                attr.addAttribute("rtype",'1');
            }else {
                attr.addAttribute("rtype",'0');
            }
        }
        return "redirect:/addStudent.jsp";
    }

    //+++++++修改学生的方法++++++++++++++++++++++++++++++++++++++++++++++++
    //首先查询出所有的学生
    @RequestMapping("/findStudentList2")
    public String findStudentList2(ModelMap map){
        List list = studentService.findStudentList();
        map.addAttribute("studentList2",list);
        return "updateStudent";
    }

    //+++++++删除学生的方法++++++++++++++++++++++++++++++++++++++++++++++++
    @RequestMapping("deleteStudent")
    public String deleteStudent(ModelMap map,Student stu){
//        System.out.println(stu.getS_no());
//        System.out.println("进入删除的方法");
        studentService.deleteStudent(stu);
        List list = studentService.findStudentList();
        map.addAttribute("studentList2",list);
        return "updateStudent";
    }




    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    public void setStudentClassService(StudentClassService studentClassService) {
        this.studentClassService = studentClassService;
    }
    public void setStudentMarkService(StudentMarkService studentMarkService) {
        this.studentMarkService = studentMarkService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
