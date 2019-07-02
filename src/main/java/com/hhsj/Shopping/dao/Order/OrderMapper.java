package com.hhsj.Shopping.dao.Order;

import com.hhsj.Shopping.pojo.Order.Order;

import java.util.List;

/**
 * Created by xtnloveyou on 2019/7/1.
 */
public interface OrderMapper {
    /***
     * 查询
     * @return
     * @throws Exception
     */
    public List<Order> findOrder()throws Exception;
}
