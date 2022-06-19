package jp.rena.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Stream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jp.rena.entity.Student;
import jp.rena.entity.User;

@Configuration
@ComponentScan("jp.rena")
public class MyConfig {

    @Bean
    public User user() {
        return new User("ASU", 19);
    }

    @Bean
    public User user2() {
        User user = new User();
        user.setAge(20);
        user.setName("ARU");
        return user;
    }

    @Bean
    public Student student() {
        Student student = new Student();
        String[] books = { "book a", "book b", "book c" };
        student.setBooks(books);
        String[] hobbies = { "hobby 1", "hobby 2", "hobby 3" };
        List<String> list = Stream.of(hobbies).toList();
        student.setHobbies(list);
        String[] cards = { "idcard 1111", "bankcard 2222" };
        Map<String, String> map = new HashMap<>();
        Stream.of(cards).forEach(e -> map.put(e.split(" ")[0], e.split(" ")[1]));
        student.setCard(map);
        String[] games = { "LOL", "BOB", "COC", "COC" };
        Set<String> set = Set.copyOf(Arrays.asList(games));
        student.setGames(set);
        student.setWife(null);
        Properties info = new Properties();
        info.setProperty("s_no", "1900130811");
        info.setProperty("s_gender", "female");
        student.setInfo(info);
        return student;

    }

}
