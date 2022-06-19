package jp.rena.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoSqlServerImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("SqlServer 获取默认User信息.");
    }

}
