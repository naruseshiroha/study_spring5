package jp.rena.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

import jp.rena.mapper.UserMapper;

@Configuration
@ComponentScan("jp.rena")
@Import(DataSourceConfig.class)
@EnableTransactionManagement
public class SpringConfig {

    @Autowired
    private DruidDataSource dataSource;

    // SqlSessionFactory
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("jp.rena.entity");
        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:jp/rena/mapper/*.xml"));
        // 交由容器管理事务
        // factoryBean.setTransactionFactory(new ManagedTransactionFactory());
        factoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
        return factoryBean.getObject();
    }

    // SqlSessionTemplate -> mapper
    @Bean
    public UserMapper userMapper() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        UserMapper userMapper = sessionTemplate.getMapper(UserMapper.class);
        return userMapper;
    }

}
