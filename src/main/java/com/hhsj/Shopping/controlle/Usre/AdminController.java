package com.hhsj.Shopping.controlle.Usre;

import com.hhsj.Shopping.pojo.User.Admin;
import com.hhsj.Shopping.service.User.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by xtnloveyou on 2019/7/4.
 */
@Controller
public class AdminController {

    @Resource
    private AdminService adminService;

    /**
     * 系统管理员登录
     * @param model
     * @param admin
     * @return
     */
    @RequestMapping("adminLogin")
    public String adminLogin(Model model, Admin admin, HttpSession session){
        Admin admin1 = adminService.adminLogin(admin);
        if(admin!=null){
            session.setAttribute("admin1",admin1);
            return "backstage";
        }else {
            return "backstageLogin";
        }
    }

}
