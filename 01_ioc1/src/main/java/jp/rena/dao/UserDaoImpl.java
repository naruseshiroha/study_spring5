package jp.rena.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("获取默认User信息.");
    }

}
