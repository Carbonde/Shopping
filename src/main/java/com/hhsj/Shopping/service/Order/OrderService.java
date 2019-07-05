package com.hhsj.Shopping.service.Order;

import com.hhsj.Shopping.dao.Order.OrderMapper;
import com.hhsj.Shopping.pojo.Order.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xtnloveyou on 2019/7/1.
 */
@Service("orderService")
public class OrderService {
    @Resource
    private OrderMapper orderMapper;

    /**
     * 首页推荐商品查询
     *
     * @return
     */
    public List<Order> findRecommend(Order order) {
        List<Order> recommend = null;
        try {
            recommend = orderMapper.findRecommend(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recommend;
    }

    /**
     * 首页杯子系列查询
     *
     * @param
     * @return
     */
    public List<Order> findOrder(Order order) {
        List<Order> order1 = null;
        try {
            order1 = orderMapper.findOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order1;
    }

    public List<Order> findTableware(Order order){
        List<Order> tableware = null;
        try {
            tableware = orderMapper.findTableware(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tableware;
    }

    public List<Order> findPaper1(Order order){
        List<Order> paper1 = null;
        try {
            paper1 = orderMapper.findPaper1(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paper1;
    }

    /**
     * 首页促销产品查询
     *
     * @param
     * @return
     */
    public List<Order> findPromotion(Order order1) {
        List<Order> order = null;
        try {
            order = orderMapper.findPromotion(order1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    /**
     * 按id查询商品
     *
     * @param id
     * @return
     */
    public Order findById(Integer id) {
        Order byId = null;
        try {
            byId = orderMapper.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byId;
    }


    /**
     * 按Id查询确认订单信息
     *
     * @param id
     * @return
     */
    public Order findPrice(Integer id) {
        Order price = null;
        try {
            price = orderMapper.findPrice(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return price;
    }

    /**
     * 按id查询购物清单
     *
     * @param id
     * @return
     */
    public List<Order> orderDetails(Integer id) {
        List<Order> order = null;
        try {
            order = orderMapper.orderDetails(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }


    /**
     * 单层杯子查询
     *
     * @param id
     * @return
     */
    public List<Order> findOrders(Order id) {
        List<Order> order = null;
        try {
            order = orderMapper.findOrders(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    /**
     * 双层杯子查询
     *
     * @param order
     * @return
     */
    public List<Order> findDeck(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 瓦楞查询
     *
     * @param order
     * @return
     */
    public List<Order> findFlutin(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询透明杯子
     *
     * @param order
     * @return
     */
    public List<Order> findLucency(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询冰淇淋杯子
     *
     * @param order
     * @return
     */
    public List<Order> findCream(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询蛋糕分类
     *
     * @param order
     * @return
     */
    public List<Order> findCake(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询沙拉分类
     *
     * @param order
     * @return
     */
    public List<Order> findSalad(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询西餐分类
     *
     * @param order
     * @return
     */
    public List<Order> findWestern(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询中餐
     *
     * @param order
     * @return
     */
    public List<Order> findChinese(Order order) {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询外带打包
     *
     * @param order
     * @return
     */
    public List<Order> findBale(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询纸碟分类
     *
     * @param order
     * @return
     */
    public List<Order> findPaper(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询纸袋子分类
     *
     * @param order
     * @return
     */
    public List<Order> findPaperBag(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询纸碗分类
     *
     * @param order
     * @return
     */
    public List<Order> findPaperBowl(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 查询食用袋子分类
     *
     * @param order
     * @return
     */
    public List<Order> findDoggieBag(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    /**
     * 食品外带打包分类
     *
     * @param order
     * @return
     */
    public List<Order> findFoodBale(Order order)

    {
        List<Order> orders = null;
        try {
            orders = orderMapper.findDeck(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }
}
