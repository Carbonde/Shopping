package com.hhsj.Shopping.service.User;


import com.hhsj.Shopping.dao.User.UserMapper;
import com.hhsj.Shopping.pojo.User.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xtnloveyou on 2019/6/26.
 */
@Service("userService")
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User LoginUser(User user) {
        User user1 = null;
        try {
            user1 = userMapper.LoginUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user1;
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    public int InsertUser(User user) {
        int i = 0;
        try {
            userMapper.InsertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
