package jp.rena.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.rena.entity.User;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserMapperImpl implements UserMapper {

    @Autowired
    private final UserMapper userMapper = null;

    @Override
    public List<User> listUsers() {
        User user = new User(6, "shabi", "123456");
        userMapper.deleteUser(90);
        userMapper.saveUser(user);

        return userMapper.listUsers();
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

}
