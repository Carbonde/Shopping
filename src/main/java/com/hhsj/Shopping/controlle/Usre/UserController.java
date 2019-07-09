package com.hhsj.Shopping.controlle.Usre;

import com.hhsj.Shopping.pojo.Order.Order;
import com.hhsj.Shopping.pojo.User.User;
import com.hhsj.Shopping.service.Order.OrderService;
import com.hhsj.Shopping.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by xtnloveyou on 2019/6/26.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private OrderService orderService;


    /**
     * 登录：登录成功跳转到首页
     * @param model
     * @param user
     * @param order
     * @param session
     * @return
     */
    @RequestMapping(value = "/login")
    public String findUser(Model model,User user,HttpSession session){
        User user1 = userService.LoginUser(user);
        if(user1!=null){
            session.setAttribute("login",user1);
            return "redirect:/main";
        }
        return "login";
    }

    /**
     * 商城首页：跳转
     * @return
     */
    @RequestMapping(value = "/main")
    public String main(Model model,Order order){
        order.setCid("c");
        List<Order> recommend = orderService.findRecommend(order);
        order.setCid("g");
        List<Order> tableware = orderService.findTableware(order);
        order.setCid("m");
        List<Order> paper1 = orderService.findPaper1(order);
        order.setCid("d");
        List<Order> order1 = orderService.findOrder(order);
        model.addAttribute("order",order1);//前台杯子显示
        model.addAttribute("recommend",recommend);//前台推荐产品显示
        model.addAttribute("tableware",tableware);//前台餐具显示
        model.addAttribute("paper1",paper1);//前台纸浆显示
        return "main";
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
