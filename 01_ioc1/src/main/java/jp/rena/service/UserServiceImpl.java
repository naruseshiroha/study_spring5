package jp.rena.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jp.rena.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDaoMysqlImpl")
    // @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
