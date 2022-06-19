package jp.rena.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.rena.entity.Dog;

@Configuration
public class MyConfig2 {

    @Bean
    public Dog dog2() {
        Dog dog2 = new Dog();
        dog2.name = "小秋";
        return dog2;
    }

}
