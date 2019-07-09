package com.hhsj.Shopping.controlle.Order;

import com.github.pagehelper.PageInfo;
import com.hhsj.Shopping.Util.PageUtil;
import com.hhsj.Shopping.pojo.Order.Order;
import com.hhsj.Shopping.service.Order.OrderService;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
     * 首页所有商品模糊查询
     * @param model
     * @param request
     * @param
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findBeizhi")
    public String findBeizhi(Model model,HttpServletRequest request,
                             @RequestParam(defaultValue = "1") int pageNum,
                             @RequestParam(defaultValue = "8") int pageSize, String name) throws Exception {
        PageInfo<Order> orderList = orderService.findBeizhi(pageNum,pageSize,name);
        List orderList1 = orderList.getList();
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotalCount(Integer.parseInt(orderList.getTotal() + ""));
        pageUtil.setPageSize(pageSize);
        pageUtil.setPageNum(pageNum);
        String path = pageUtil.getPath(request);
        model.addAttribute("orderList1",orderList1);
        model.addAttribute("pageUtil",pageUtil);
        model.addAttribute("path",path);
        model.addAttribute("name",name);
        model.addAttribute("orderList",orderList);
        return "Business/product";
    }

    /**
     * 首页商品购物车信息查询
     * @param order
     * @param model
     * @return
     */
    @RequestMapping(value = "/findGwc")
    public String findGwc(Model model,Order order){
        List<Order> orderList = orderService.findGwc(order);
        model.addAttribute("orderList",orderList);
        return "Business/order1";
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
     * 默认首页按id查询商品信息
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById1")
    public String findById1(Model model, Integer id) {
        Order byId = orderService.findById(id);
        model.addAttribute("byId", byId);
        return "Multiplexing/proinfo1";
    }

    /**
     * 按Id查询确认订单信息,并修改购买数量
     *
     * @param model
     * @param id
     * @return
     */

    @RequestMapping(value = "/UpdatePrice")
    public String UpdatePrice(Model model,Integer id,Order order){
        int orde1 = orderService.UpdatePrice(order);
        if(orde1!=0){
            Order findPrice = orderService.findPrice(id);
            model.addAttribute("findPrice", findPrice);
            return "Business/order";
        }else {
            return "Business/proinfo";
        }
    }

    /**
     * 按id查询购物商品清单
     *
     * @param model
     * @param user_id
     * @return
     */
    @RequestMapping(value = "/orderDetails")
    public String orderDetails(Model model,HttpServletRequest request, Integer user_id, @RequestParam(defaultValue = "1")Integer PageNum,
                                                             @RequestParam(defaultValue = "8")Integer PageSize) {
        PageInfo<Order> orderDetails = orderService.orderDetails(PageNum,PageSize,user_id);
        List orderList1 = orderDetails.getList();
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotalCount(Integer.parseInt(orderDetails.getTotal() + ""));
        pageUtil.setPageSize(PageSize);
        pageUtil.setPageNum(PageNum);
        String path = pageUtil.getPath(request);
        model.addAttribute("orderList1",orderList1);
        model.addAttribute("pageUtil",pageUtil);
        model.addAttribute("path",path);
        model.addAttribute("user_id",user_id);
        model.addAttribute("orderDetails", orderDetails);
        return "Business/order2";
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
