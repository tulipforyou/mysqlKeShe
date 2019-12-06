package model;
/*
@author 孙朝辉
@create 2019-11-30 下午8:05
@packName model
@sys sunchaohui
@project keShe
*/

import java.util.List;

public class deptLinkStaff {
    private DeptDesc dd;
    private StaffDesc sd;

    public DeptDesc getDd() {
        return dd;
    }

    public void setDd(DeptDesc dd) {
        this.dd = dd;
    }

    public StaffDesc getSd() {
        return sd;
    }

    public void setSd(StaffDesc sd) {
        this.sd = sd;
    }

    @Override
    public String toString() {
        return "deptLinkStaff{" +
                "dd=" + dd +
                ", sd=" + sd +
                '}';
    }
}
