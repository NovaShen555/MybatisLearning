package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.novashen.dao.UserMapper;
import top.novashen.pojo.User;
import top.novashen.utils.MybatisUtils;

import java.util.List;

public class UserMapperTest {

    @Test
    public void t(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.getUserById(1));
    }

}
