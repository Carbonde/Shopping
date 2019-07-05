package com.hhsj.Shopping.dao.User;

import com.hhsj.Shopping.pojo.User.Admin;

/**
 * Created by xtnloveyou on 2019/7/4.
 */
public interface AdminMapper {

    /**
     * 系统管理登录
     * @param admin
     * @return
     */
    public Admin adminLogin(Admin admin)throws Exception;
}
