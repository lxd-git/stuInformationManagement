package com.maven.service;

import com.maven.dao.StudentMarkDao;
import com.maven.entity.StudentMark;
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
public class StudentMarkService {
    @Resource(name = "studentMarkDao")
    private StudentMarkDao studentMarkDao;

    //查询学生成绩的方法
    public List findStudentMarkList(){
        String hql="from StudentMark s inner join s.s";
        return studentMarkDao.findStudentMarkList(hql);
    }

    //添加学生成绩的方法
    public boolean addStudentMark(StudentMark stum){
        return studentMarkDao.addStudentMark(stum);
    }

    //删除成绩的方法
    public boolean deleteStudentMark(StudentMark stum){
        return studentMarkDao.deleteStudentMark(stum);
    }

    public void setStudentMarkDao(StudentMarkDao studentMarkDao) {
        this.studentMarkDao = studentMarkDao;
    }
}
