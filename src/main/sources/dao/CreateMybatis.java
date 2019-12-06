package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class CreateMybatis {

    private static SqlSession ReturnMybatis() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //需要sqlSessionFactoryBuilder
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //生产一个sqlSession
        return sqlSessionFactory.openSession();
    }
    public static SqlSession getSession() throws IOException {
        return ReturnMybatis();
    }

}
