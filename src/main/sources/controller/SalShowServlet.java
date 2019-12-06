package controller;/*
@author 孙朝辉
@create 2019-11-30 下午4:52
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.SalHandle;
import dao.StaffHandle;
import model.SalDesc;
import model.StaffDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/SalShowServlet")
public class SalShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SalDesc> listSal= SalHandle.selectAllSal();
        request.setAttribute("allSal",listSal);
        List<Integer> list=StaffHandle.selectAllStaffIds();
        request.getSession().setAttribute("listForSalIds",list);
        request.getRequestDispatcher("/jsp/manage/sal.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
