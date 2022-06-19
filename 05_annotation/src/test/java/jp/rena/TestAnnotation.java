package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.rena.config.MyConfig;
import jp.rena.entity.Dog;
import jp.rena.entity.User;

public class TestAnnotation {

    @Test
    void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user == user2);

        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog.name);
        Dog dog2 = context.getBean("dog2", Dog.class);
        System.out.println(dog2.name);

    }
}
