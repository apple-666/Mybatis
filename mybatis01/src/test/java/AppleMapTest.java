import com.apple.dao.AppleDao;
import com.apple.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Double_apple
 * @Date 2022/1/25 0:25
 * @Version 1.0
 */
public class AppleMapTest {
    //测试 id 查询
    @Test
    public void come(){
        //1.连通对应的主机 获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2.执行SQL
        // 方式二：使用getMapper
        AppleDao appleDao = sqlSession.getMapper(AppleDao.class);
        //insert map
        Map<String,Object> applemp=new HashMap<String, Object>();
        System.out.println(appleDao.listApple());
        applemp.put("iid","0");
        applemp.put("nname","apple");
        applemp.put("ccolor","4");
        appleDao.addAppleMap(applemp);
        sqlSession.commit();
        System.out.println(appleDao.listApple());
        //关闭sqlSession
        sqlSession.close();
    }
}
