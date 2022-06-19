package jp.rena.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import jp.rena.entity.Dog;

@Configuration
@Import(MyConfig2.class)
@ComponentScan("jp.rena")
public class MyConfig {

    @Bean
    public Dog dog() {
        return new Dog();
    }

}
