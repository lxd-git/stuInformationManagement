package com.maven.web;

import com.maven.entity.Users;
import com.maven.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2017/12/29.
 */
@Controller
@RequestMapping("/usersAction")
public class UsersAction {
    @Resource(name = "usersService")
    private UsersService usersService;

    //用户登录
    @RequestMapping("/loginUsers")
    public String loginUser(Users users, RedirectAttributes attr, HttpSession session){
        //System.out.println(users.getU_name()+','+users.getU_pwd()+','+users.getU_status());
        if (users != null){
           Users user=usersService.doLogin(users);
            if (user!=null){
                session.setAttribute("loginUser",user);
                return "redirect:/main.jsp";
            }else {
                attr.addAttribute("rtype","-1");
            }
            }else {
                attr.addAttribute("rtype","-1");
            }
             return "redirect:/index.jsp";
    }


    //注册用户
    @RequestMapping("/addUsers")
    public String addUsers(Users users,RedirectAttributes attr){
        //调用服务层方法执行添加业务
        if (users!=null){
            System.out.println(users.getU_name()+","+users.getU_pwd()+","+users.getU_status());
            if(users.getU_name().equals("")||users.getU_pwd().equals("")){
                attr.addAttribute("rtype",'2');
                return "redirect:/addUser.jsp";
            }
            if (usersService.addUsers(users)){
                //添加成功
                 attr.addAttribute("rtype",'1');
                    return "redirect:/addUser.jsp";
            }else {
                    //添加失败
               attr.addAttribute("rtype",'0');
            }

        }
        return "redirect:/addUser.jsp";
    }

    //修改用户密码
    @RequestMapping("/updateUsers")
    public String updateUsers(Users users,RedirectAttributes attr){
        System.out.println(users.getU_id());
        Users users1 = usersService.findUsersById(users.getU_id());
        users1.setU_pwd(users.getU_pwd());
        if (users!=null){
            if (usersService.updateUsers(users1)){
                attr.addAttribute("rtype",'1');
            }else {
                attr.addAttribute("rtype",'0');
            }
        }
        return "redirect:/selfMake.jsp";
    }

    //查询单个用户的方法
    @RequestMapping("/findUsersByID")
    public Users findUsersByID(int id){
        return usersService.findUsersById(id);
    }


    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}
