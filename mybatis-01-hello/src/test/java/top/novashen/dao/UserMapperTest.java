package top.novashen.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.novashen.pojo.User;
import top.novashen.utils.MybatisUtils;

import java.util.List;

public class UserMapperTest {
    @Test
    public void Test(){
        //获得sqlsession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //通过class获取其配置文件绑定的对象

        //通过getMapper获取，老方法
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
//        //旧方法，直接通过接口调用sql语句
//        List<User> userList = sqlSession.selectList("top.novashen.dao.UserMapper.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("----------------------------------------");

        System.out.println(userMapper.getUserById(1));

        //关闭资源
        sqlSession.close();
    }

    @Test
    public void AddUserTest(){
        User user = new User(666,"asdasda","asdasdadasd");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.addUser(user);
        if (i!=0){
            //提交事务
            sqlSession.commit();
        }
        System.out.println(i);
    }


    @Test
    public void UpdateUserTest(){
        User user = new User(4,"newname","newpassword");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(user);
        if ( i > 0 ) {
            sqlSession.commit();
            System.out.println(i);
        }
    }



}
