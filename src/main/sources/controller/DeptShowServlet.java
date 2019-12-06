package controller;/*
@author 孙朝辉
@create 2019-11-30 下午3:19
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.DeptHandle;
import model.DeptDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/DeptShowServlet")
public class DeptShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<DeptDesc> listDept= DeptHandle.selectAllDept();
        request.setAttribute("allDepts",listDept);
        request.getRequestDispatcher("/jsp/manage/dept.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
