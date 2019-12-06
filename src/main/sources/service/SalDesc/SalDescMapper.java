package service.SalDesc;
/*
@author 孙朝辉
@create 2019-11-24 下午3:02
@packName service.SalDesc
@sys sunchaohui
@project keShe
*/

import model.SalDesc;

import java.util.List;

public interface SalDescMapper {
    void addSalDesc(SalDesc dd);
    void deleteSalDesc(int salId);
    void alterSalDesc(SalDesc dd);
    List<SalDesc> selectAllSalDesc();
    SalDesc selectSalById(int id);
}
