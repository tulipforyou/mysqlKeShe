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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

public class RegisterServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("username");
        String password1=request.getParameter("password1");
        String password2=request.getParameter("password2");
        if(!CheckAdminName.isExist(userName)||(!password1.equals(password2))){//用户名重复或密码不一致
            request.setAttribute("registerInfo","用户名重复或密码不一致．请重新注册");
            request.getRequestDispatcher("/jsp/register.jsp").forward(request,response);
        }else{
            Admin ad=new Admin();
            ad.setAdminName(userName);
            ad.setAdminPassword(password1);
            long millis=System.currentTimeMillis();
            ad.setAdminSignDate(new Date(millis));
            AdminHandle.saveAdmin(ad);
            request.setAttribute("registerInfo","注册成功，请登录");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
