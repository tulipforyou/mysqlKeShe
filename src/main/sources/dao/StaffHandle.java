package dao;
/*
@author 孙朝辉
@create 2019-11-30 下午4:19
@packName dao
@sys sunchaohui
@project keShe
*/

import model.StaffDesc;
import org.apache.ibatis.session.SqlSession;
import service.DeptDesc.DeptDescMapper;
import service.StaffDesc.StaffDescMapper;

import java.io.IOException;
import java.util.List;

public class StaffHandle {
    public static List<StaffDesc> selectAllStaff(){
        try(SqlSession session=CreateMybatis.getSession()) {
            StaffDescMapper staffDescMapper=session.getMapper(StaffDescMapper.class);
            return staffDescMapper.selectAllStaffDesc();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static StaffDesc selectAStaff(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            StaffDescMapper staffDescMapper=session.getMapper(StaffDescMapper.class);
            return staffDescMapper.selectStaffById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void alterStaff(StaffDesc sd){
        try(SqlSession session=CreateMybatis.getSession()) {
            StaffDescMapper staffDescMapper=session.getMapper(StaffDescMapper.class);
            staffDescMapper.updateStaffDesc(sd);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteStaff(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            StaffDescMapper staffDescMapper=session.getMapper(StaffDescMapper.class);
            staffDescMapper.deleteStaffDesc(id);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addStaff(StaffDesc sd){
        try(SqlSession session=CreateMybatis.getSession()) {
            StaffDescMapper staffDescMapper=session.getMapper(StaffDescMapper.class);
            staffDescMapper.addStaffDesc(sd);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Integer> selectAllStaffIds(){
        try(SqlSession session=CreateMybatis.getSession()) {
            StaffDescMapper staffDescMapper=session.getMapper(StaffDescMapper.class);
            return staffDescMapper.staffIds();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
