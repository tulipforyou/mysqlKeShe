package controller;/*
@author 孙朝辉
@create 2019-11-27 下午5:05
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.CheckAdminName;
import model.Admin;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
@WebServlet(urlPatterns = "/ResetServlet")
public class ResetServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("username");
        String password1=request.getParameter("password1");
        String password2=request.getParameter("password2");
        if(!CheckAdminName.isExist(userName)&&(password1.equals(password2))){//用户名重复或密码不一致
            request.setAttribute("resetInfo","重置成功，请登录");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            Admin ad=new Admin();
            ad.setAdminName(userName);
            ad.setAdminPassword(password1);
            AdminHandle.alterPassword(ad);
        }else{
            request.setAttribute("resetInfo","密码不一致或用户不存在");
            request.getRequestDispatcher("/jsp/reset.jsp").forward(request,response);
        }
    }
}
