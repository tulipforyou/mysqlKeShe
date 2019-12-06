package model;
/*
@author 孙朝辉
@create 2019-11-24 下午2:50
@packName model
@sys sunchaohui
@project keShe
*/

public class SalDesc {
    private int salId;
    private int staffId;
    private int salBase;
    private int salComm;
    private int salExtra;
    private int salDeduct;
    private int salElse;

    @Override
    public String toString() {
        return "SalDesc{" +
                "salId=" + salId +
                ", staffId=" + staffId +
                ", salBase=" + salBase +
                ", salComm=" + salComm +
                ", salExtra=" + salExtra +
                ", salDeduct=" + salDeduct +
                ", salElse=" + salElse +
                '}';
    }

    public int getSalId() {
        return salId;
    }

    public void setSalId(int salId) {
        this.salId = salId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getSalBase() {
        return salBase;
    }

    public void setSalBase(int salBase) {
        this.salBase = salBase;
    }

    public int getSalComm() {
        return salComm;
    }

    public void setSalComm(int salComm) {
        this.salComm = salComm;
    }

    public int getSalExtra() {
        return salExtra;
    }

    public void setSalExtra(int salExtra) {
        this.salExtra = salExtra;
    }

    public int getSalDeduct() {
        return salDeduct;
    }

    public void setSalDeduct(int salDeduct) {
        this.salDeduct = salDeduct;
    }

    public int getSalElse() {
        return salElse;
    }

    public void setSalElse(int salElse) {
        this.salElse = salElse;
    }
}
