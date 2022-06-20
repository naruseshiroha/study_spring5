package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jp.rena.config.ApplicationConfig;
import jp.rena.mapper.UserMapper;

public class TestSpringMybatis {

    @Test
    void testSpringMybatis() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.listUsers().forEach(System.out::println);
    }

    @Test
    void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        // UserMapper userMapper = context.getBean("userMapper",UserMapper.class);

        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        userMapper.listUsers().forEach(System.out::println);

        System.out.println("----------------------");
        UserMapper userService = context.getBean("userService", UserMapper.class);
        userService.listUsers().forEach(System.out::println);

        System.out.println(userService);
    }

}
