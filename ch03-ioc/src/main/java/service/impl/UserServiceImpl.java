package service.impl;

import dao.UserDao;
import domain.SysUser;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("用户服务的实现");
    }

    @Resource(name = "oracleUserDao")
    private UserDao dao = null;

    @Override
    public void addUser(SysUser user) {
        dao.insertUser(user);
    }
}
