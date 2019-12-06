package dao;
/*
@author 孙朝辉
@create 2019-11-27 下午8:46
@packName dao
@sys sunchaohui
@project keShe
*/

import model.Admin;
import model.deptLinkStaff;
import org.apache.ibatis.session.SqlSession;
import service.Admin.AdminMapper;

import java.io.IOException;
import java.util.List;

public class AdminHandle {
    public static void saveAdmin(Admin ad){
        try (SqlSession session=CreateMybatis.getSession()){
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            adminMapper.addAdmin(ad);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean checkAdmin(Admin ad){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            Admin ad1=adminMapper.selectAAdmin(ad);
            //有这个用户
            return ad1 != null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static List<Admin> showAllAdmin(){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            return adminMapper.selectAllAdmin();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void alterAdmin(Admin ad){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            adminMapper.alterAdminPassword(ad);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Admin selectAdmin(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            return adminMapper.selectById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void deleteAdmin(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            adminMapper.deleteAdmin(id);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addAdmin(Admin ad){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            adminMapper.addAdmin(ad);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void alterPassword(Admin ad){
        try(SqlSession session=CreateMybatis.getSession()) {
            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
            adminMapper.alterAdminPasswordByAdminName(ad);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
