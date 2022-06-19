package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.rena.config.MyConfig;
import jp.rena.entity.User;

public class MyTest {
    @Test
    void testSpring() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("user", User.class);
        user.setName("spring");
        user.show();
    }

    @Test
    void testArgs() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = context.getBean("user2", User.class);
        user.show();

    }
}
