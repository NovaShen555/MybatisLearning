package top.novashen.dao;

import top.novashen.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);


    List<Blog> queryBlogByIf(Map params);

    List<Blog> queryBlogByChoose(Map params);

}
