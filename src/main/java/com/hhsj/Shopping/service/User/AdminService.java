package com.hhsj.Shopping.service.User;

import com.hhsj.Shopping.dao.User.AdminMapper;
import com.hhsj.Shopping.pojo.User.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xtnloveyou on 2019/7/4.
 */
@Service("adminService")
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin adminLogin(Admin admin){
        Admin admin1 = null;
        try {
            admin1 = adminMapper.adminLogin(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin1;
    }
}
