package controller;/*
@author 孙朝辉
@create 2019-11-27 下午9:08
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import model.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        Admin ad=new Admin();
        ad.setAdminName(username);
        ad.setAdminPassword(password);
        boolean hasAdmin=AdminHandle.checkAdmin(ad);
        if(hasAdmin){//验证成功
            request.getSession().setAttribute("SuccessAdmin",ad.getAdminName());
            request.getSession().setAttribute("SuccessAdminAtTime",new Date());
            response.sendRedirect(request.getContextPath()+"/jsp/manage/first.jsp");
        }else{
            request.setAttribute("registerInfo","用户名或密码错误");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
