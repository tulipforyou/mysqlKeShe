/*
@author 孙朝辉
@create 2019-11-24 下午3:18
@packName PACKAGE_NAME
@sys sunchaohui
@project keShe
*/

import com.sun.xml.internal.bind.v2.TODO;
import dao.CreateMybatis;
import model.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import service.Admin.AdminMapper;
import service.DeptAndStaffs.DeptAndStaffsMapper;
import service.DeptDesc.DeptDescMapper;
import service.SalDesc.SalDescMapper;
import service.StaffDesc.StaffDescMapper;
import service.deptLinkStaff.deptLinkStaffMapper;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1() throws IOException {
        SqlSession session=CreateMybatis.getSession();
//        AdminMapper mapper=session.getMapper(AdminMapper.class);
//        Admin ad=new Admin();
//        ad.setAdminName("赵静静");
//        ad.setAdminPassword("hahahah");
//        long millis=System.currentTimeMillis();
//        ad.setAdminSignDate(new Date(millis));
//        mapper.addAdmin(ad);

        //mapper.deleteAdmin("孙玉婷");

//        Admin ad=new Admin();
//        ad.setAdminName("test");
//        ad.setAdminPassword("2");
//        mapper.alterAdminPassword(ad);

//        List<Admin> list=new ArrayList<>();
//        list=mapper.selectAllAdmin();
//        for(Admin ad:list)
//            System.out.println(ad);

//        DeptDescMapper mapper1=session.getMapper(DeptDescMapper.class);
//        DeptDesc dd=new DeptDesc();
//        dd.setDeptName("生产部");
//        dd.setDeptAddr("河南洛阳");
//        mapper1.addDeptDsc(dd);

//        dd.setDeptId(1);
//        dd.setDeptName("销售部");
//        dd.setDeptAddr("河南郑州");
//        mapper1.alterDeptDesc(dd);

//        List<DeptDesc> list=mapper1.selectAllDeptDesc();
//        for (DeptDesc ddd:list) {
//            System.out.println(ddd);
//        }

//        mapper1.deleteDeptDesc("销售部");

//       StaffDescMapper mapper3=session.getMapper(StaffDescMapper.class);
//        StaffDesc sd=new StaffDesc();
//        sd.setStaffName("肖建");
//        sd.setStaffPost("HTML设计");
//        long millis=System.currentTimeMillis();
//        sd.setStaffHireDate(new Date(millis));
//        sd.setDeptId(2);
//        mapper3.addStaffDesc(sd);

//        SalDescMapper mapper2=session.getMapper(SalDescMapper.class);
//        SalDesc sd=new SalDesc();
//        sd.setStaffId(1);
//        sd.setSalBase(9000);
//        sd.setSalComm(600);
//        sd.setSalExtra(1500);
//        sd.setSalDeduct(1600);
//        sd.setSalElse(5000);
//        mapper2.addSalDesc(sd);

//        List<StaffDesc> list=mapper3.selectAllStaffDesc();
//        for(StaffDesc sf:list)
//            System.out.println(sf);

//        DeptAndStaffsMapper mapper5=session.getMapper(DeptAndStaffsMapper.class);
//        DeptDesc dd=new DeptDesc();
//        dd.setDeptId(3);
////
//        int i=dd.getDeptId();
//        List<DeptAndStaffs> list=mapper5.selectAllStaff(i);
//        for(DeptAndStaffs dass:list)
//            System.out.println(dass);

//        deptLinkStaffMapper dd=session.getMapper(deptLinkStaffMapper.class);
//        List<deptLinkStaff> list=dd.selectAll();
//        for(deptLinkStaff d:list){
//            System.out.println(d);
//        }
        DeptDescMapper dd=session.getMapper(DeptDescMapper.class);
        List<Integer> l=dd.deptIds();
        for(int i:l)
            System.out.println(i);
        session.commit();
        session.close();
    }
}
