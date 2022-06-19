package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jp.rena.service.UserService;

public class TestAop {

    @Test
    void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // UserService userService = context.getBean("userService", UserService.class);
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        // System.out.println(userService);

        userService.add();
    }
}
