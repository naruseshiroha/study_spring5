package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.rena.config.MyConfig;
import jp.rena.dao.UserDao;
import jp.rena.dao.UserDaoImpl;
import jp.rena.dao.UserDaoMysqlImpl;
import jp.rena.dao.UserDaoOracleImpl;
import jp.rena.dao.UserDaoSqlServerImpl;
import jp.rena.service.UserService;
import jp.rena.service.UserServiceImpl;

public class TestIOC {

    @Test
    void testIOC() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UserDao userDao;

        userDao = context.getBean("userDaoImpl", UserDaoImpl.class);
        userDao = context.getBean("userDaoMysqlImpl", UserDaoMysqlImpl.class);
        userDao = context.getBean("userDaoOracleImpl", UserDaoOracleImpl.class);
        userDao = context.getBean("userDaoSqlServerImpl", UserDaoSqlServerImpl.class);

        userDao.getUser();
    }

    @Test
    void testIOC2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UserService userService = context.getBean(UserServiceImpl.class);

        userService.getUser();
    }

}
