package controller;/*
@author 孙朝辉
@create 2019-11-30 下午4:18
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
import java.util.List;

@WebServlet(urlPatterns = "/StaffShowServlet")
public class StaffShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StaffDesc> listStaff= StaffHandle.selectAllStaff();
        List<Integer> list= DeptHandle.selectAllDeptIds();
        request.getSession().setAttribute("listForStaffIds",list);
        request.setAttribute("allStaffs",listStaff);
        request.getRequestDispatcher("/jsp/manage/staff.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
