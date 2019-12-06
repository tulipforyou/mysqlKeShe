package model;
/*
@author 孙朝辉
@create 2019-11-24 下午2:45
@packName model
@sys sunchaohui
@project keShe
*/

import java.sql.Date;

public class Admin {
    private int adminId;
    private String adminName;
    private String adminPassword;
    private Date adminSignDate;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminSignDate=" + adminSignDate +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Date getAdminSignDate() {
        return adminSignDate;
    }

    public void setAdminSignDate(Date adminSignDate) {
        this.adminSignDate = adminSignDate;
    }
}
