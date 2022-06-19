package jp.rena.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 代表这是一个配置类
@Configuration
// <context:component-scan base-package="packageName"/>
@ComponentScan("jp.rena")
public class MyConfig {

}
