package com.hhsj.Shopping.controlle.Jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xtnloveyou on 2019/7/2.
 * 跳转类
 */
@Controller
public class JumpControlle {

    /**
     * 结算页面: 跳转
     * @return
     */
    @RequestMapping(value = "/order")
    public String order1(){
        return "Business/order";
    }

    /**
     * 联系我们: 跳转
     * @return
     */
    @RequestMapping(value = "/contact")
    public String contact(){
        return "Business/contact";
    }

    /**
     * 首页联系我们: 跳转
     * @return
     */
    @RequestMapping(value = "/contact1")
    public String contact1(){
        return "Multiplexing/contact1";
    }

    /**
     * 商城首页：跳转
     * @return
     */
    @RequestMapping(value = "/main")
    public String main(){
        return "main";
    }

    /**
     * 促销页面：跳转
     * @return
     */
    @RequestMapping(value = "/product")
    public String product(){
        return "Business/product";
    }

    /**
     * 首页促销页面：跳转
     * @return
     */
    @RequestMapping(value = "/product1")
    public String product1(){
        return "Multiplexing/product1";
    }

    /**
     * 会员中心:跳转
     * @return
     */
    @RequestMapping(value = "/vip")
    public String vlp(){
        return "Vip/vip";
    }


    /**
     * 帮助中心: 跳转
     * @return
     */
    @RequestMapping(value = "/help")
    public String help(){
        return "Business/help";
    }

    /**
     * 首页帮助中心: 跳转
     * @return
     */
    @RequestMapping(value = "/help1")
    public String help1(){
        return "Multiplexing/help1";
    }

    /**
     * 首页商品首页：跳转
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    /**
     * 商品信息：跳转
     * @return
     */
    @RequestMapping(value = "/proinfo")
    public String proinfo(){
        return "Business/proinfo" ;
    }

}
