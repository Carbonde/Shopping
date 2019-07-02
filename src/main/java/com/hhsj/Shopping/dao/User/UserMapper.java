package com.hhsj.Shopping.dao.User;

import com.hhsj.Shopping.pojo.User.User;

/**
 * Created by xtnloveyou on 2019/6/26.
 */
public interface UserMapper {
    /**
     * 登录
     * @param user
     * @return
     * @throws Exception
     */
    public User LoginUser(User user) throws Exception;

    /**
     * 注册
     * @param user
     * @return
     * @throws Exception
     */
    public int InsertUser(User user) throws Exception;
}
