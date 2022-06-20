package jp.rena;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.rena.config.SpringConfig;
import jp.rena.entity.User;
import jp.rena.mapper.UserMapper;

public class TestTransaction {

    @Test
    void testTransaction() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserMapper userService = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userService.listUsers();
        users.forEach(System.out::println);

    }

    @Test
    void testAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userService = context.getBean("userMapperImpl", UserMapper.class);

        User user = new User(40, "999", "999999");
        userService.saveUser(user);
    }
}
