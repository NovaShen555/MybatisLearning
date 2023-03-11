package top.novashen.dao;

import top.novashen.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //新增用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);
}
