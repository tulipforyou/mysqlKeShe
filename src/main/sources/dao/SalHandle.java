package dao;
/*
@author 孙朝辉
@create 2019-11-30 下午4:53
@packName dao
@sys sunchaohui
@project keShe
*/

import model.SalDesc;
import org.apache.ibatis.session.SqlSession;
import service.SalDesc.SalDescMapper;
import service.StaffDesc.StaffDescMapper;

import java.io.IOException;
import java.util.List;

public class SalHandle {
    public static List<SalDesc> selectAllSal(){
        try(SqlSession session=CreateMybatis.getSession()) {
            SalDescMapper salDescMapper=session.getMapper(SalDescMapper.class);
            return salDescMapper.selectAllSalDesc();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static SalDesc selectSal(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            SalDescMapper salDescMapper=session.getMapper(SalDescMapper.class);
            return salDescMapper.selectSalById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void alterSal(SalDesc sd){
        try(SqlSession session=CreateMybatis.getSession()) {
            SalDescMapper salDescMapper=session.getMapper(SalDescMapper.class);
            salDescMapper.alterSalDesc(sd);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteSal(int id){
        try(SqlSession session=CreateMybatis.getSession()) {
            SalDescMapper salDescMapper=session.getMapper(SalDescMapper.class);
            salDescMapper.deleteSalDesc(id);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addSal(SalDesc sd){
        try(SqlSession session=CreateMybatis.getSession()) {
            SalDescMapper salDescMapper=session.getMapper(SalDescMapper.class);
            salDescMapper.addSalDesc(sd);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
