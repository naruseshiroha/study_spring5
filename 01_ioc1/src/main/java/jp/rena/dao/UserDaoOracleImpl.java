package jp.rena.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoOracleImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("Oracle 获取默认User信息.");
    }

}
