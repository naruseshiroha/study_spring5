package jp.rena.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("MySQL 获取默认User信息.");
    }

}
