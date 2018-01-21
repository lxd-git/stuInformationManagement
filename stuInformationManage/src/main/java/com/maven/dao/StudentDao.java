package com.maven.dao;

import com.maven.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Repository("studentDao")
@Transactional(propagation = Propagation.REQUIRED)
public class StudentDao extends BaseDao{

    //增加学生
    public boolean addStudent(Student stu){
        try {
            getSession().save(stu);
            return true;
        }catch (Exception e){

        }
        return false;
    }

    //删除学生
    public boolean deleteStudent(Student stu){
        try {
            getSession().delete(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //修改学生
    public boolean updateStudent(Student stu){
        try {
            getSession().update(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //查询学生
    public Student findStudentById(int id){
        return getSession().get(Student.class,id);
    }
    public List findStudentList(String hql){
        return getSession().createQuery(hql).list();
    }

}
