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

    public List<Order> findOrder(int id){
        List<Order> order = null;
        try {
            order = orderMapper.findOrder(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
}
