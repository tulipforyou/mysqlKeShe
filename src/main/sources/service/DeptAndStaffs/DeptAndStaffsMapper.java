package service.DeptAndStaffs;
/*
@author 孙朝辉
@create 2019-11-24 下午5:18
@packName service.DeptAndStaffs
@sys sunchaohui
@project keShe
*/

import model.DeptAndStaffs;

import java.util.List;

public interface DeptAndStaffsMapper {
    List<DeptAndStaffs> selectAllStaff(int deptId);
}
