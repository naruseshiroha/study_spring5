package jp.rena.mapper;

import java.util.List;

import jp.rena.entity.User;

public interface UserMapper {
    public List<User> listUsers();

    public int saveUser(User user);

    public int deleteUser(Integer id);
}
