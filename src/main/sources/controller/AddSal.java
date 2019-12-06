package controller;/*
@author 孙朝辉
@create 2019-12-06 上午10:58
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.SalHandle;
import model.SalDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AddSal")
public class AddSal extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int staffId=Integer.parseInt(request.getParameter("staffId"));
        int salBase=Integer.parseInt(request.getParameter("salBase"));
        int salComm=Integer.parseInt(request.getParameter("salComm"));
        int salExtra=Integer.parseInt(request.getParameter("salExtra"));
        int salDeduct=Integer.parseInt(request.getParameter("salDeduct"));
        int salElse=Integer.parseInt(request.getParameter("salElse"));
        SalDesc sd=new SalDesc();
        sd.setStaffId(staffId);
        sd.setSalBase(salBase);
        sd.setSalComm(salComm);
        sd.setSalDeduct(salDeduct);
        sd.setSalExtra(salExtra);
        sd.setSalElse(salElse);
        SalHandle.addSal(sd);
        request.getRequestDispatcher("/SalShowServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
