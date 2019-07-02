package com.hhsj.Shopping.controlle.Usre;

import com.hhsj.Shopping.pojo.User.User;
import com.hhsj.Shopping.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by xtnloveyou on 2019/6/26.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    /***
     * 首页展示
     * @return
     */
    @RequestMapping(value = "/")
    public String findUser(){
        return "index";
    }

    /**
     * 登录：登录成功跳转首页
     * @param user
     * @param session
     * @return
     */
    @RequestMapping(value ="login")
    public String login(Model model,User user, HttpSession session){
        User user1 = userService.LoginUser(user);
        model.addAttribute("user",user1);
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

    @RequestMapping(value = "/proinfo")
    public String proinfo(){
        return "Business/proinfo";
    }

}
