package dao.impl;

import dao.UserDao;
import domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("oracleUserDao")
public class OracleUserDaoImpl implements UserDao {
    public OracleUserDaoImpl() {
        System.out.println("orcle实现");
    }

    @Override
    public void insertUser(SysUser sysUser) {
        System.out.println("oracle的插入用户数据");
    }
}
