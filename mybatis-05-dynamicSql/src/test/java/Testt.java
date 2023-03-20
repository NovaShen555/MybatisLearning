import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.novashen.dao.BlogMapper;
import top.novashen.pojo.Blog;
import top.novashen.utils.IdUtils;
import top.novashen.utils.MybatisUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Testt {
    @Test
    public void t(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getUUID());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IdUtils.getUUID());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getUUID());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getUUID());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void t2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map params = new HashMap();
        params.put("author","狂神说");
//        params.put("title","微服务如此简单");

        System.out.println(mapper.queryBlogByIf(params));

        /*
        * Blog(id=26cbb67b-d597-4c5e-b5d6-d892e3533bc1, title=Mybatis如此简单, author=狂神说, createTime=Mon Mar 20 19:23:20 CST 2023, views=6666),
        * Blog(id=c81435b7-f2ce-4716-8e26-2adaa0633c23, title=Spring如此简单, author=狂神说, createTime=Mon Mar 20 19:23:20 CST 2023, views=3333),
        * Blog(id=3087cb38-68c6-4b8c-9849-c98b5fef4930, title=微服务如此简单, author=狂神说, createTime=Mon Mar 20 19:23:20 CST 2023, views=4444)]
         */
    }

    @Test
    public void t3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map params = new HashMap();
        params.put("author","狂神说");
        params.put("title","微服务如此简单");

        System.out.println(mapper.queryBlogByChoose(params));

        /*
        Blog(id=3087cb38-68c6-4b8c-9849-c98b5fef4930, title=微服务如此简单, author=狂神说1, createTime=Mon Mar 20 19:23:20 CST 2023, views=4444)
         */
    }
}
