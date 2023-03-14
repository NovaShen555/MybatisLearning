import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import top.novashen.dao.UserMapper;
import top.novashen.utils.MybatisUtils;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void t(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.getUserById(1));

        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("[INFO]Enter function");
        logger.debug("[DEBUG]Enter debug");
        logger.error("[ERROR]Enter error");
    }
}
