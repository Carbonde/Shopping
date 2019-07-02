package com.hhsj.Shopping.controlle.Usre;

import com.hhsj.Shopping.pojo.User.User;
import com.hhsj.Shopping.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by xtnloveyou on 2019/6/26.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录：登录成功跳转到首页
     * @param user
     * @param //session
     * @return
     */
    @RequestMapping(value = "/login")
    public String findUser(User user, HttpSession session){
        User user1 = userService.LoginUser(user);
        if(user1!=null){
            session.setAttribute("login",user1);
            return "main";
        }
        return "login";
    }

    /**
     * 注册：跳转到注册页面
     * @return
     */
    @RequestMapping(value = "/reg")
    public String reg(){
        return "reg";
    }
    /**
     * 注册用户
     */
    @RequestMapping(value = "/Add")
    public java.lang.String InsetUser(User user, HttpSession session, Model model) {
        user.setCreated(new Date());
        user.setUpdated(new Date());
        int i = userService.InsertUser(user);
        if (i == 1) {
            return "login";
        } else {
            return "reg";
        }

    }

}
