import com.apple.dao.AppleDao;
import com.apple.pojo.Apple;
import com.apple.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/24 22:24
 * @Version 1.0
 */

public class AppleTest {

    @Test
    public void come1_1(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper 推荐使用）
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        List<Apple> appleList = appleDao.listApple();

        System.out.println(appleList);
//        for (Apple apple : appleList) {
//            System.out.println(apple);
//        }

        //关闭sqlSession
        sqlSession.close();
    }


    @Test
    public void come1_2(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper 推荐使用）
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        List<Apple> appleList = appleDao.listApple2();

        System.out.println(appleList);
//        for (Apple apple : appleList) {
//            System.out.println(apple);
//        }

        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void come2(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式二：使用sqlsession的固定方法
        List<Object> appleList = sqlSession.selectList("com.apple.dao.AppleDao.listApple");
        System.out.println(appleList);
//        for (Apple apple : appleList) {
//            System.out.println(apple);
//        }

        //关闭sqlSession
        sqlSession.close();
    }


    //测试C
    @Test
    public void come3(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式一：使用getMapper
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        //c
        List<Apple> appleList1 = appleDao.listApple();
        System.out.println(appleList1);

        Apple apple = new Apple();
        apple.setId(3);
        apple.setColor(2);
        apple.setName("watermelon2");
        appleDao.addApple(apple);
        System.out.println("加入了："+apple);

        List<Apple> appleList2 = appleDao.listApple();
        System.out.println(appleList2);

        sqlSession.commit();

        //关闭sqlSession
        sqlSession.close();
    }

    //测试u
    @Test
    public void come4(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式二：使用getMapper
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        //c
        List<Apple> appleList1 = appleDao.listApple();
        System.out.println(appleList1);

        Apple apple = new Apple();
        apple.setId(3);
        apple.setColor(4);
        apple.setName("waterapple");
        appleDao.updApple(apple);
        System.out.println("修改成了："+apple);

        List<Apple> appleList2 = appleDao.listApple();
        System.out.println(appleList2);

        sqlSession.commit();

        //关闭sqlSession
        sqlSession.close();
    }


    //测试d
    @Test
    public void come5(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式二：使用getMapper
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        //c
        List<Apple> appleList1 = appleDao.listApple();
        System.out.println(appleList1);

        appleDao.delApple(0);
        System.out.println("删除了id:"+0);

        List<Apple> appleList2 = appleDao.listApple();
        System.out.println(appleList2);

        sqlSession.commit();

        //关闭sqlSession
        sqlSession.close();
    }

    //测试 id 查询
    @Test
    public void come6(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式二：使用getMapper
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        //c
        System.out.println(appleDao.listApple());
        System.out.println(appleDao.queryApple(2));

        sqlSession.commit();

        //关闭sqlSession
        sqlSession.close();
    }

    //测试 模糊查询
    @Test
    public void come7(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式二：使用getMapper
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        //c
        System.out.println(appleDao.queryAppleLike("pple"));
        sqlSession.commit();

        //关闭sqlSession
        sqlSession.close();
    }
}
