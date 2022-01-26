import com.apple.dao.BlogMapper;
import com.apple.pojo.Blog;
import com.apple.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @Author Double_apple
 * @Date 2022/1/26 15:24
 * @Version 1.0
 */
public class AppleTest {

    @Test
    public void come1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(3);
        blog.setTitle("weibo1");
        blog.setAuthor("apple");
        blog.setCreateTime(new Date());
        blog.setViews(10111);

        blog.setId(5);
        blog.setTitle("weibo2");
        blog.setAuthor("apple2");
        blog.setCreateTime(new Date());
        blog.setViews(1032);


        blogMapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }

    // IF
    @Test
    public void come2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> mp = new HashMap<String, Object>();
//        mp.put("title","blog1");
        mp.put("author","apple2");
//        mp.put("views","10");
        System.out.println(blogMapper.listBlogIf(mp));
        sqlSession.close();
    }

    // Choose
    @Test
    public void come3(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> mp = new HashMap<String, Object>();
        mp.put("title","blog1");
//        mp.put("author","apple2");
//        mp.put("views","10");
        System.out.println(blogMapper.listBlogChoose(mp));
        sqlSession.close();
    }

    // Set
    @Test
    public void come4(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> mp = new HashMap<String, Object>();
        mp.put("id","2");
        mp.put("author","apple");
//        mp.put("author","apple2");
//        mp.put("views","10");
        System.out.println(blogMapper.updateBlogSet(mp));
        sqlSession.commit();
        sqlSession.close();
    }

    // Foreach
    @Test
    public void come5(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,List<Integer>> mp = new HashMap<String, List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        mp.put("lists",list);
        System.out.println(blogMapper.listBlogForeach(mp));
        sqlSession.close();
    }
}
