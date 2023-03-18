package top.novashen.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

//工具类
public class MybatisUtils {

    private static final SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
            System.out.println("read config-----------------------");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession getSqlSession(){
        //有自动提交
        return sqlSessionFactory.openSession(true);
//        return sqlSessionFactory.openSession();
//        没有自动提交
    }

}
