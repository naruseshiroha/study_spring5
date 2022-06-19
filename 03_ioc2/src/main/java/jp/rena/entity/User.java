package jp.rena.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
// @NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private Integer age;

    public User() {
        System.out.println("No Args Constructor");
    }

}
