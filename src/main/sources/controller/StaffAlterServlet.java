package controller;/*
@author 孙朝辉
@create 2019-11-30 下午4:33
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.DeptHandle;
import dao.StaffHandle;
import model.DeptDesc;
import model.StaffDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/StaffAlterServlet")
public class StaffAlterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("staffId"));
        String staffName=request.getParameter("staffName");
        String staffPost=request.getParameter("staffPost");
        int deptId=Integer.parseInt(request.getParameter("deptId"));
        String staffBoss=request.getParameter("staffBoss");
        StaffDesc sd=new StaffDesc();
        sd.setStaffBoss(staffBoss);
        sd.setStaffId(id);
        sd.setStaffName(staffName);
        sd.setStaffPost(staffPost);
        sd.setDeptId(deptId);
        StaffHandle.alterStaff(sd);
        request.getRequestDispatcher("/StaffShowServlet").forward(request,response);

    }
}
