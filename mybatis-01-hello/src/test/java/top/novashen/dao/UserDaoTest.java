package top.novashen.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.novashen.pojo.User;
import top.novashen.utils.MybatisUtils;

import java.util.List;

public class UserDaoTest {
    @Test
    public void Test(){
        //获得sqlsession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //通过class获取其配置文件绑定的对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //关闭资源
        sqlSession.close();
    }
}
