package com.maven.service;

import com.maven.dao.StudentClassDao;
import com.maven.entity.StudentClass;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentClassService {
    @Resource(name = "studentClassDao")
    private StudentClassDao studentClassDao;

    //查询所有班级
    public List<StudentClass> findStudentClassList(){
        String hql="from StudentClass";
        return studentClassDao.findStudentClassList(hql);
    }

    public void setStudentClassDao(StudentClassDao studentClassDao) {
        this.studentClassDao = studentClassDao;
    }
}
