package com.apple.dao;

import com.apple.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Author Double_apple
 * @Date 2022/1/26 18:37
 * @Version 1.0
 */
public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> listBlogIf(Map map);

    List<Blog> listBlogChoose(Map map);

    int updateBlogSet(Map map);

    List<Blog> listBlogForeach(Map map);

}
