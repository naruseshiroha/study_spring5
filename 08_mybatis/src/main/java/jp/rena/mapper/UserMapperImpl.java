package jp.rena.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import jp.rena.entity.User;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> listUsers() {
        System.out.println("userMapperImpl two");
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.listUsers();
    }

}
