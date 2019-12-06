package controller;/*
@author 孙朝辉
@create 2019-12-06 上午10:05
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.StaffHandle;
import model.StaffDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AStaffByAllDeptAndStaff")
public class AStaffByAllDeptAndStaff extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int staffId=Integer.parseInt(request.getParameter("id"));
        StaffDesc staff= StaffHandle.selectAStaff(staffId);
        request.setAttribute("aStaff",staff);
        request.getRequestDispatcher("/jsp/manage/staffAlter.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
