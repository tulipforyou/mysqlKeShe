package controller;/*
@author 孙朝辉
@create 2019-11-30 下午7:54
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.StaffHandle;
import model.Admin;
import model.StaffDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = "/AddStaff")
public class AddStaff extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("静茹");
        String staffName=request.getParameter("staffName");
        String staffPost=request.getParameter("staffPost");
        String staffBoss=request.getParameter("staffBoss");
        int deptId=Integer.parseInt(request.getParameter("deptId"));
        StaffDesc sd=new StaffDesc();

        System.out.println(sd);

        long millis=System.currentTimeMillis();
        sd.setStaffHireDate(new Date(millis));
        sd.setStaffName(staffName);
        sd.setStaffPost(staffPost);
        sd.setStaffBoss(staffBoss);
        sd.setDeptId(deptId);
        StaffHandle.addStaff(sd);
        request.getRequestDispatcher("/StaffShowServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
