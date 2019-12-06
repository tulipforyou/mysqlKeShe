package model;
/*
@author 孙朝辉
@create 2019-11-24 下午5:16
@packName model
@sys sunchaohui
@project keShe
*/

import java.util.List;

public class DeptAndStaffs {
    private DeptDesc deptDesc;
    private List<StaffDesc> listStaffDesc;

    @Override
    public String toString() {
        return "DeptAndStaffs{" +
                "deptDesc=" + deptDesc +
                ", listStaffDesc=" + listStaffDesc +
                '}';
    }

    public DeptDesc getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(DeptDesc deptDesc) {
        this.deptDesc = deptDesc;
    }

    public List<StaffDesc> getListStaffDesc() {
        return listStaffDesc;
    }

    public void setListStaffDesc(List<StaffDesc> listStaffDesc) {
        this.listStaffDesc = listStaffDesc;
    }
}
