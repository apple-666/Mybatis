import com.apple.dao.BoxDao;
import com.apple.pojo.Box;
import com.apple.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @Author Double_apple
 * @Date 2022/1/26 15:24
 * @Version 1.0
 */
public class AppleTest {

    @Test
    public void come1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BoxDao boxDao = sqlSession.getMapper(BoxDao.class);

//        Box box = boxDao.getBox(1);
//        System.out.println(boxDao.listBox());
        Box box = boxDao.getBox2(1);
        sqlSession.close();
    }
}
