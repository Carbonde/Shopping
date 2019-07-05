package com.hhsj.Shopping.controlle.Jump;

import com.hhsj.Shopping.pojo.Order.Order;
import com.hhsj.Shopping.service.Order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by xtnloveyou on 2019/7/2.
 * 跳转类
 */
@Controller
public class JumpControlle {
    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/backstage")
    public String login(){
        return "backstageLogin";
    }
    /**
     * 商城首页：跳转
     * @return
     */
    @RequestMapping(value = "/main")
    public String main(Model model){
        return "main";
    }

    /**
     * 结算页面: 跳转
     * @return
     */
    @RequestMapping(value = "/order")
    public String order1(){
        return "Business/order2";
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
    public String index(Model model,Order order){
       /* order.setCid("c");
        List<Order> recommend = orderService.findRecommend(order);
        order.setCid("b");
        List<Order> tableware = orderService.findTableware(order);
        order.setCid("a");
        List<Order> paper1 = orderService.findPaper1(order);
        order.setCid("a");
        List<Order> order1 = orderService.findOrder(order);
        model.addAttribute("order",order1);//前台杯子显示
        model.addAttribute("recommend",recommend);//前台推荐产品显示
        model.addAttribute("tableware",tableware);//前台餐具显示
        model.addAttribute("paper1",paper1);//前台纸浆显示*/
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
