package jp.rena.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

import jp.rena.mapper.UserMapper;

@Configuration
public class SpringConfig {
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

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setTypeAliasesPackage("jp.rena.entity");

        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:jp/rena/mapper/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSession() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Bean
    public UserMapper userService() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper;
    }
}
