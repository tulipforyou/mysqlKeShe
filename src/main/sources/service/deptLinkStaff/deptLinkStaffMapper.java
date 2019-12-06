package service.deptLinkStaff;
/*
@author 孙朝辉
@create 2019-11-30 下午8:07
@packName service.deptLinkStaffMapper
@sys sunchaohui
@project keShe
*/

import model.deptLinkStaff;

import java.util.List;

public interface deptLinkStaffMapper {
    List<deptLinkStaff> selectAll();
}
