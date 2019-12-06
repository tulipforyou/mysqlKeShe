package controller;/*
@author 孙朝辉
@create 2019-11-30 下午8:28
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.DeptLinkStaffHandle;
import model.deptLinkStaff;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/deptAndStaffShowServlet")
public class deptAndStaffShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<deptLinkStaff> list= DeptLinkStaffHandle.selectDeptAndStaffAll();
        request.setAttribute("allDeptAndStaff",list);
        request.getRequestDispatcher("/jsp/manage/deptAndStaffAll.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
