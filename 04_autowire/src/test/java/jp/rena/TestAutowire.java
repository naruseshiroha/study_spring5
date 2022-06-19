package jp.rena;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jp.rena.config.MyConfig;
import jp.rena.entity.People;

public class TestAutowire {

    @Test
    void testAutowire() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        People people = context.getBean("people", People.class);

        System.out.println(people);
        people.getCat().Nyann();
        people.getDog().wang();

        // User user = context.getBean("user",User.class);
    }
}
