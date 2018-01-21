package com.maven.service;

import com.maven.dao.StudentDao;
import com.maven.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentService {
    @Resource(name = "studentDao")
    private StudentDao studentDao;

    //查询学生信息的方法
    public List findStudentList(){
        String hql="from Student s inner join s.sc";
        return studentDao.findStudentList(hql);
    }
    //模糊查询学生信息的方法
    public List findStudentList(int stuclass,String stuname){
        System.out.println("服务层："+stuclass+","+stuname);
            if (stuclass==0&&stuname==""){
                String hql="from Student s inner join s.sc";
                return studentDao.findStudentList(hql);
            }
            if (stuclass==0&&stuname!=""){
                String hql="from Student s inner join s.sc on  s.s_name='"+stuname+"'";
                return studentDao.findStudentList(hql);
            }
            if (stuclass!=0&&stuname==""){
                String hql="from Student s inner join s.sc on  s.sc="+stuclass+"";
                return studentDao.findStudentList(hql);
            }
                String hql="from Student s inner join s.sc on s.sc="+stuclass+" and s.s_name='"+stuname+"'";
                return studentDao.findStudentList(hql);
    }

    //查询方法的重载
    public List findStudentList(String hql){
        return studentDao.findStudentList(hql);
    }

    //添加学生信息的方法
    public boolean addStudent(Student stu){
        return studentDao.addStudent(stu);
    }

    //删除学生信息的方法
    public boolean deleteStudent(Student stu){
        return studentDao.deleteStudent(stu);
    }



    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
