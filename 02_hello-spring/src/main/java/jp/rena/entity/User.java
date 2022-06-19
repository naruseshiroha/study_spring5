package jp.rena.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // @Value("Spring")
    private String name;

    public void show() {
        System.out.println("name: " + name);
    }

}
