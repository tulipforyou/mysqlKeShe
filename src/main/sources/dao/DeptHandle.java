package dao;
/*
@author 孙朝辉
@create 2019-11-30 下午3:21
@packName dao
@sys sunchaohui
@project keShe
*/

import model.DeptDesc;
import org.apache.ibatis.session.SqlSession;
import service.DeptDesc.DeptDescMapper;

import java.io.IOException;
import java.util.List;

public class DeptHandle {
    public static List<DeptDesc> selectAllDept(){
        try(SqlSession session=CreateMybatis.getSession()) {
            DeptDescMapper deptDescMapper=session.getMapper(DeptDescMapper.class);
            return deptDescMapper.selectAllDeptDesc();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static DeptDesc selectDept(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            DeptDescMapper deptDescMapper=session.getMapper(DeptDescMapper.class);
            return deptDescMapper.selectDeptById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void alterDept(DeptDesc dd){
        try(SqlSession session=CreateMybatis.getSession()) {
            DeptDescMapper deptDescMapper=session.getMapper(DeptDescMapper.class);
            deptDescMapper.alterDeptDesc(dd);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteDept(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            DeptDescMapper deptDescMapper=session.getMapper(DeptDescMapper.class);
            deptDescMapper.deleteDeptDesc(id);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addDept(DeptDesc dd){
        try(SqlSession session=CreateMybatis.getSession()) {
            DeptDescMapper deptDescMapper=session.getMapper(DeptDescMapper.class);
            deptDescMapper.addDeptDsc(dd);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Integer> selectAllDeptIds(){
        try(SqlSession session=CreateMybatis.getSession()) {
            DeptDescMapper deptDescMapper=session.getMapper(DeptDescMapper.class);
            return deptDescMapper.deptIds();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
