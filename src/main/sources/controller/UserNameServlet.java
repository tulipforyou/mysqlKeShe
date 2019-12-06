package controller;/*
@author 孙朝辉
@create 2019-11-27 下午5:05
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.CheckAdminName;
import dao.CreateMybatis;
import model.Admin;
import org.apache.ibatis.session.SqlSession;
import service.Admin.AdminMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserNameServlet extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor of the object.
     */
    public UserNameServlet() {
        super();
    }
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        boolean isExist= CheckAdminName.isExist(username);
        response.getWriter().append("{\"isExist\":").append(String.valueOf(isExist)).append("}");
    }
    public void init() throws ServletException {
        // Put your code here
    }
}
