package com.hhsj.Shopping.dao.User;

import com.hhsj.Shopping.pojo.User.User;

/**
 * Created by xtnloveyou on 2019/6/26.
 */
public interface UserMapper {
    /*登录
    * */
    public User LoginUser(User user) throws Exception;
}
