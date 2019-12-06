package service.DeptDesc;
/*
@author 孙朝辉
@create 2019-11-24 下午3:02
@packName service.DeptDesc
@sys sunchaohui
@project keShe
*/

import model.DeptDesc;

import java.util.List;

public interface DeptDescMapper {
    void addDeptDsc(DeptDesc dd);
    void deleteDeptDesc(int id);
    void alterDeptDesc(DeptDesc dd);
    List<DeptDesc> selectAllDeptDesc();
    DeptDesc selectDeptById(int id);
    List<Integer> deptIds();
}
