package com.maven.web;

import com.maven.entity.StudentClass;
import com.maven.service.StudentClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */
@Controller
@RequestMapping("/studentClassAction")
public class StudentClassAction {
    @Resource(name = "studentClassService")
    private StudentClassService studentClassService;


    //查询所有班级的方法
    @RequestMapping("/findStudentClassList")
    @ResponseBody
    public List<StudentClass> findStudentClassList(){
        System.out.println("进入查询班级的方法");
        return studentClassService.findStudentClassList();
    }


    public void setStudentClassService(StudentClassService studentClassService) {
        this.studentClassService = studentClassService;
    }
}
