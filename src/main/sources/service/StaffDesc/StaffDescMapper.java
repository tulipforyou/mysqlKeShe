package service.StaffDesc;
/*
@author 孙朝辉
@create 2019-11-24 下午3:02
@packName service.StaffDesc
@sys sunchaohui
@project keShe
*/

import model.StaffDesc;

import java.util.List;

public interface StaffDescMapper {
    void addStaffDesc(StaffDesc sd);
    void deleteStaffDesc(int id);
    void updateStaffDesc(StaffDesc sd);
    List<StaffDesc> selectAllStaffDesc();
    StaffDesc selectStaffById(int id);
    List<Integer> staffIds();
}
