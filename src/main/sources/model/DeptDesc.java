package model;
/*
@author 孙朝辉
@create 2019-11-24 下午2:49
@packName model
@sys sunchaohui
@project keShe
*/

public class DeptDesc {
    private int deptId;
    private String deptName;
    private String deptAddr;

    @Override
    public String toString() {
        return "DeptDesc{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptAddr='" + deptAddr + '\'' +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr;
    }
}
