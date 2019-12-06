package model;
/*
@author 孙朝辉
@create 2019-11-24 下午2:47
@packName model
@sys sunchaohui
@project keShe
*/

import java.sql.Date;

public class StaffDesc {
    private int staffId;
    private String staffName;
    private String staffPost;
    private String staffBoss;
    private Date staffHireDate;
    private int deptId;

    @Override
    public String toString() {
        return "StaffDesc{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffPost='" + staffPost + '\'' +
                ", staffBoss='" + staffBoss + '\'' +
                ", staffHireDate=" + staffHireDate +
                ", deptId=" + deptId +
                '}';
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPost() {
        return staffPost;
    }

    public void setStaffPost(String staffPost) {
        this.staffPost = staffPost;
    }

    public String getStaffBoss() {
        return staffBoss;
    }

    public void setStaffBoss(String staffBoss) {
        this.staffBoss = staffBoss;
    }

    public Date getStaffHireDate() {
        return staffHireDate;
    }

    public void setStaffHireDate(Date staffHireDate) {
        this.staffHireDate = staffHireDate;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
