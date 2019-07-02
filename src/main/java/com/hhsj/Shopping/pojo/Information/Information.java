package com.hhsj.Shopping.pojo.Information;

import java.util.Date;

/**
 * Created by zz on 2019/7/1.
 */
public class Information {
    private Integer id;//id
    private Integer order_id;//商品id
    private Integer user_id;//用户id
    private Integer addr_id;//地址id
    private String payment;//实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
    private Integer payment_type;//支付类型，1、货到付款，2、在线支付，3、微信支付，4、支付宝支付
    private String post_fee;//邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
    private Integer status;//状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
    private Integer shipping_name;//物流名称
    private Integer shipping_code;//物流单号
    private String total_weight;//订单总重 单位/克
    private Integer buyer_rate;//买家是否已经评价
    private Date close_time;//交易关闭时间
    private Date end_time;//交易完成时间
    private Date payment_time;//付款时间
    private Date consign_time;//发货时间
    private Date create_time;//订单创建时间
    private Date update_time;//订单更新时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(Integer addr_id) {
        this.addr_id = addr_id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(Integer payment_type) {
        this.payment_type = payment_type;
    }

    public String getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(String post_fee) {
        this.post_fee = post_fee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShipping_name() {
        return shipping_name;
    }

    public void setShipping_name(Integer shipping_name) {
        this.shipping_name = shipping_name;
    }

    public Integer getShipping_code() {
        return shipping_code;
    }

    public void setShipping_code(Integer shipping_code) {
        this.shipping_code = shipping_code;
    }

    public String getTotal_weight() {
        return total_weight;
    }

    public void setTotal_weight(String total_weight) {
        this.total_weight = total_weight;
    }

    public Integer getBuyer_rate() {
        return buyer_rate;
    }

    public void setBuyer_rate(Integer buyer_rate) {
        this.buyer_rate = buyer_rate;
    }

    public Date getClose_time() {
        return close_time;
    }

    public void setClose_time(Date close_time) {
        this.close_time = close_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(Date payment_time) {
        this.payment_time = payment_time;
    }

    public Date getConsign_time() {
        return consign_time;
    }

    public void setConsign_time(Date consign_time) {
        this.consign_time = consign_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
