package com.maven.dao;

import com.maven.entity.StudentMark;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Repository("studentMarkDao")
@Transactional(propagation = Propagation.REQUIRED)
public class StudentMarkDao extends BaseDao{

    //添加成绩
    public boolean addStudentMark(StudentMark stum){
        try {
            getSession().save(stum);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //删除成绩
    public boolean deleteStudentMark(StudentMark stum){
        try {
            getSession().delete(stum);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //修改成绩
    public boolean updateStudentMark(StudentMark stum){
        try {
            getSession().update(stum);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //查询学生
    public StudentMarkDao findStudentMarkById(int id){
        return getSession().get(StudentMarkDao.class,id);
    }
    public List findStudentMarkList(String hql){
        return getSession().createQuery(hql).list();
    }

}
