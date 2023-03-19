import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.novashen.dao.StudentMapper;
import top.novashen.dao.TeacherMapper;
import top.novashen.pojo.Student;
import top.novashen.utils.MybatisUtils;

import java.util.List;

public class Testtt {
    @Test
    public void t(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void t1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.getStudentById(1));
    }

    @Test
    public void t2(){
        //一对多
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacherById(1));
    }
}
