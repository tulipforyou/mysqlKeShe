package service.Admin;
/*
@author 孙朝辉
@create 2019-11-24 下午3:01
@packName service.Admin
@sys sunchaohui
@project keShe
*/

import model.Admin;

import java.util.List;

public interface AdminMapper {
    void addAdmin(Admin ad);
    void deleteAdmin(int id);
    void alterAdminPassword(Admin ad);
    List<Admin> selectAllAdmin();
    Admin selectByName(String adminName);
    Admin selectAAdmin(Admin ad);
    Admin selectById(int id);
    void alterAdminPasswordByAdminName(Admin ad);
}
