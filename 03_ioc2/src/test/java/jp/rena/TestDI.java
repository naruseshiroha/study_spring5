package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.rena.config.MyConfig;
import jp.rena.entity.Student;
import jp.rena.entity.User;

public class TestDI {

    @Test
    void testDI() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // User user = context.getBean("user",User.class);
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user);
        System.out.println(user == user2);
    }

    @Test
    void trestDI2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // User user = context.getBean("user",User.class);
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

}
