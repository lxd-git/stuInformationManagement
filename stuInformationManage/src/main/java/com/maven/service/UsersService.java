package com.maven.service;

import com.maven.dao.UsersDao;
import com.maven.entity.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2017/12/29.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersService {

    @Resource(name = "usersDao")
    private UsersDao usersDao;

    //查询用户，实现登录
    public Users doLogin(Users users){
        String hql = "from Users u where u.u_name = '"+users.getU_name()+"' ";
        //取出用户后台数据
        List<Users> list = usersDao.findUsersList(hql);
        if (list!=null&&list.size()>0){
            for (Users u:list) {
                if (users.getU_name().equals(u.getU_name())&&users.getU_pwd().equals(u.getU_pwd())&&users.getU_status()==u.getU_status()){
                    return u;
                }
            }
        }return null;
    }

    //查询单个用户信息
    public Users findUsersById(int id){
        return usersDao.findUsersList(id);
    }

    //修改用户密码
    public boolean updateUsers(Users users){
        return usersDao.updateUsers(users);
    }

    //添加用户
    public boolean addUsers(Users users){
        return usersDao.addUsers(users);
    }

}
