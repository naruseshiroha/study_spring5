package jp.rena.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@Component
public class DataSourceConfig {

    // DataSource
    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(
                "jdbc:mysql:///mybatis?useSSL=false&characterEncoding=UTF-8&useUnicode=true&serverTimezones=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("lixunsam");
        return dataSource;
    }

    // 标准配置
    // DataSourceTransactionManager
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
