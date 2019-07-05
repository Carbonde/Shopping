package com.hhsj.Shopping.controlle.Order;

import com.hhsj.Shopping.pojo.Order.Order;
import com.hhsj.Shopping.service.Order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xtnloveyou on 2019/7/1.
 */
@Controller
public class OrderControlle {
    @Resource
    private OrderService orderService;

    /**
     * 首页商品推荐查询
     *
     * @param model
     * @param order
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findRecommend")
    public List<Order> findOrder(Model model, Order order) {
        List<Order> orders = orderService.findRecommend(order);
        return orders;
    }

    /**
     * 首页商品促销查询
     *
     * @param model
     * @param order
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findPromotion")
    public List<Order> findPromotion(Model model, Order order) {
        List<Order> orders = orderService.findPromotion(order);
        return orders;
    }

    /**
     * 按id查询商品信息
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById")
    public String findById(Model model, Integer id) {
        Order byId = orderService.findById(id);
        model.addAttribute("byId", byId);
        return "Business/proinfo";
    }

    /**
     * 按Id查询确认订单信息
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/findPrice")
    public String findPrice(Model model, Integer id) {
        Order findPrice = orderService.findPrice(id);
        model.addAttribute("findPrice", findPrice);
        return "Business/order";
    }

    /**
     * 按id查询购物商品清单
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/orderDetails")
    public String orderDetails(Model model, Integer id) {
        List<Order> orderDetails = orderService.orderDetails(id);
        model.addAttribute("orderDetails", orderDetails);
        return "Business/order";
    }

    /**
     * 查询单层杯子
     *
     * @param
     * @param
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findOrders")
    public List<Order> findOrders(Order order) {
        //a
        List<Order> orders = orderService.findOrders(order);
        return orders;
    }

    /**
     * 查询双层杯子
     *
     * @param
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findDeck")
    public List<Order> findDeck(Order order) {
        //b
        List<Order> orders = orderService.findDeck(order);
        return orders;
    }

    /**
     * 查询瓦楞杯子
     *
     * @param
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findFlutin")
    public List<Order> findFlutin(Order order) {
        //c
        List<Order> orders = orderService.findFlutin(order);
        return orders;

    }

    /**
     * 查询透明杯子
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findLucency")
    public List<Order> findLucency(Model model, Order order ) {
        //待修改为d
        List<Order> orders = orderService.findLucency(order);
        return orders;
    }

    /**
     * 查询冰淇淋杯子
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findCream")
    public List<Order> findCream(Model model, Order order) {
        //待修改为e
        List<Order> orders = orderService.findCream(order);
        return orders;
    }

    /**
     * 查询蛋糕分类
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findCake")
    public List<Order> findCake(Model model, Order order ) {
        //待修改为f
        List<Order> orders = orderService.findCake(order);
        return orders;
    }


    /**
     * 查询沙拉分类
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findSalad")
    public List<Order> findSalad(Model model, Order order) {
        //待修改为g
        List<Order> orders = orderService.findSalad(order);
        return orders;
    }

    /**
     * 查询西餐
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findWestern")
    public List<Order> findWestern(Model model, Order order) {
        //待修改为h
        List<Order> orders = orderService.findWestern(order);
        return orders;
    }

    /**
     * 查询中餐
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findChinese")
    public List<Order> findChinese(Model model, Order order) {
        //待修改为i
        List<Order> orders = orderService.findChinese(order);
        return orders;
    }

    /**
     * 查询外带打包
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findBale")
    public List<Order> findBale(Model model, Order order) {
        //待修改为j
        List<Order> orders = orderService.findBale(order);
        return orders;
    }

    /**
     * 查询纸碟分类
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findPaper")
    public List<Order> findPaper(Model model, Order order) {
        //待修改为k
        List<Order> orders = orderService.findPaper(order);
        return orders;
    }

    /**
     * 查询纸袋子分类
     *
     * @param model
     * @param order
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findPaperBag")
    public List<Order> findPaperBag(Model model, Order order, HttpSession session) {
        //待修改为l
        List<Order> orders = orderService.findPaperBag(order);
        return orders;
    }

    /**
     * 查询纸碗分类
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findPaperBowl")
    public List<Order> findPaperBowl(Model model, Order order) {
        //待修改为m
        List<Order> orders = orderService.findPaperBowl(order);
        return orders;
    }

    /**
     * 查询食用袋子分类
     *
     * @param model
     * @param order
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findDoggieBag")
    public List<Order> findDoggieBag(Model model, Order order) {
        //待修改为n
        List<Order> orders = orderService.findDoggieBag(order);
        return orders;
    }

    /**
     * 食品外带打包分类
     *
     * @param model
     * @param order
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findFoodBale")
    public List<Order> findFoodBale(Model model, Order order) {
        //待修改为o
        List<Order> orders = orderService.findFoodBale(order);
        return orders;
    }

}
