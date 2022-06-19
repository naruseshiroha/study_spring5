package jp.rena.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jp.rena.entity.User;

@Configuration
@ComponentScan("jp.rena")
public class MyConfig {

    @Value("Hello, world!")
    private String name;

    @Bean
    public User user2() {
        return new User(name);
    }
}
