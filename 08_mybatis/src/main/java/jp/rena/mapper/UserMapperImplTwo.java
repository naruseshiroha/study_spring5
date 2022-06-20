package jp.rena.mapper;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import jp.rena.entity.User;

public class UserMapperImplTwo extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> listUsers() {
        System.out.println("userMapperImpl two");
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        return userMapper.listUsers();
    }

}
