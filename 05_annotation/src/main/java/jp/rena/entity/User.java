package jp.rena.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Scope("prototype")
public class User {
    @Value("wang ba")
    private String name;
}
