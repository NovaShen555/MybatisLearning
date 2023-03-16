package top.novashen.dao;

import org.apache.ibatis.annotations.Select;
import top.novashen.pojo.User;

public interface UserMapper {

    //根据id查询用户
    @Select("select * from user where id = #{id}")
    User getUserById(int id);


}
