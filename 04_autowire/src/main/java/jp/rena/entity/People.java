package jp.rena.entity;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class People {

    @Value("li si")
    private String name;

    @Autowired(required = false)
    @Qualifier("cat")
    private Cat cat;

    @Resource
    private Dog dog;

}
