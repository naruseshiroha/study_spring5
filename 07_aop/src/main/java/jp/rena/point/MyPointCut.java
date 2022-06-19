package jp.rena.point;

import org.springframework.stereotype.Component;

@Component
public class MyPointCut {

    public void before() {
        System.out.println("===before===");
    }

    public void after() {
        System.out.println("===after===");
    }

}
