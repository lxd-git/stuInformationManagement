package com.maven.dao;

import com.maven.entity.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/12/29.
 */
@Repository("usersDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UsersDao extends BaseDao {
    //查询用户
    public List findUsersList(String hql){
        return getSession().createQuery(hql).list();
    }
    //添加用户
    public boolean addUsers(Users users){
        try {
            getSession().save(users);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //修改用户
    public boolean updateUsers(Users users){
        try {
            getSession().update(users);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }
    //查询单个用户
    public Users findUsersList(int id){
        try {
            return getSession().get(Users.class,id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
