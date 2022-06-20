package jp.rena.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.rena.entity.User;
import lombok.Data;

@Service
@Data
public class UserMapperImpl implements UserMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }

}
