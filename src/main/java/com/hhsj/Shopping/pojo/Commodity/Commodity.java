package com.hhsj.Shopping.pojo.Commodity;

import java.util.Date;

/**
 * Created by zz on 2019/7/1.
 */
public class Commodity {
    private Integer item_id;//商品ID
    private String describe;//商品描述
    private String  comment;//商品评论
    private Date created;//创建时间
    private Date updated;//更新时间

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
