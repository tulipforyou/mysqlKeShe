package dao;
/*
@author 孙朝辉
@create 2019-11-30 下午8:36
@packName dao
@sys sunchaohui
@project keShe
*/

import model.deptLinkStaff;
import org.apache.ibatis.session.SqlSession;
import service.deptLinkStaff.deptLinkStaffMapper;

import java.io.IOException;
import java.util.List;

public class DeptLinkStaffHandle {
    public static List<deptLinkStaff> selectDeptAndStaffAll(){
        try(SqlSession session=CreateMybatis.getSession()) {
            deptLinkStaffMapper deptLinkStaffMapper=session.getMapper(deptLinkStaffMapper.class);
            return deptLinkStaffMapper.selectAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
