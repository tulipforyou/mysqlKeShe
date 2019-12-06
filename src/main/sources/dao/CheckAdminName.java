package dao;
/*
@author 孙朝辉
@create 2019-11-27 下午7:44
@packName dao
@sys sunchaohui
@project keShe
*/

import model.Admin;
import org.apache.ibatis.session.SqlSession;
import service.Admin.AdminMapper;

import java.io.IOException;
import java.io.PrintWriter;

public class CheckAdminName {
    public static boolean isExist(String name) throws IOException {
        SqlSession session= CreateMybatis.getSession();
        //获取数据库的数据
        AdminMapper adminMapper=session.getMapper(AdminMapper.class);
        Admin ad=adminMapper.selectByName(name);
        session.close();
        return ad == null;
    }
}
