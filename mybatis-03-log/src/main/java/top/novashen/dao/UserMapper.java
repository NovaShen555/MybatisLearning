package top.novashen.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.novashen.pojo.User;

public interface UserMapper {

    //根据id查询用户
    @Select("select * from user where id = #{rename_id}")
    User getUserById(@Param("rename_id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int insertUser(User user);

}
