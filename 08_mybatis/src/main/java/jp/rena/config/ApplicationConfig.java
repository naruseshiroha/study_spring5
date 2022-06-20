package jp.rena.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("jp.rena")
@Import(SpringConfig.class)
public class ApplicationConfig {

}
