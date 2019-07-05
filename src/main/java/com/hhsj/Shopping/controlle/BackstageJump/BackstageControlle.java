package com.hhsj.Shopping.controlle.BackstageJump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xtnloveyou on 2019/7/4.
 */
@Controller
public class BackstageControlle {

    /**
     * 首页系统跳转
     * @return
     */
    @RequestMapping(value = "/home")
    public  String home(){
        return "backstage/home";
    }

    /**
     *首页商品信息跳转
     * @return
     */
    @RequestMapping(value = "/Products")
    public String Products(){
        return "backstage/Products_List";
    }

    /**
     * 首页订单信息跳转
     * @return
     */
    @RequestMapping("/Orderform")
    public String Orderform(){
        return "backstage/Orderform";
    }

    /**
     * 首页订单信息跳转
     * @return
     */
    @RequestMapping(value = "/Amounts")
    public String Amounts(){
        return "backstage/Amounts";
    }

    /**
     * 首页留言列表信息跳转
     * @return
     */
    @RequestMapping(value = "/Guestbook")
    public String Guestbook(){
        return "backstage/Guestbook";
    }

    /**
     * 首页意见反馈跳转
     * @return
     */
    @RequestMapping(value = "/Feedback")
    public String Feedback(){
        return "backstage/Feedback";
    }

    /**
     *首页管理员信息跳转
     * @return
     */
    @RequestMapping(value = "/System_Logs")
    public String System(){
        return "backstage/System_Logs";
    }

    /**
     *首页管理员信息列表跳转
     * @return
     */
    @RequestMapping(value = "/administrator")
    public String administrator(){
        return "backstage/administrator";
    }

    /**
     * 首页个人信息跳转
     * @return
     */
    @RequestMapping(value = "admin_info")
    public String admin_info(){
        return "backstage/admin_info";
    }

}
