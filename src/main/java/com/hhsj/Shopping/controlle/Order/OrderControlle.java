package com.hhsj.Shopping.controlle.Order;

import com.hhsj.Shopping.pojo.Order.Order;
import com.hhsj.Shopping.service.Order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xtnloveyou on 2019/7/1.
 */
@Controller
public class OrderControlle {
    @Resource
    private OrderService orderService;

    @RequestMapping(value ="/findOrder")
    public String findOrder(Model model){
        List<Order> order = orderService.findOrder();
        model.addAttribute("order",order);
        return "main";
    }

}
