package top.novashen.dao;

import org.apache.ibatis.annotations.Param;
import top.novashen.pojo.Teacher;

public interface TeacherMapper {

    Teacher getTeacherById(@Param("id") int id);

}
