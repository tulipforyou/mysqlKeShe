package filter;/*
@author 孙朝辉
@create 2019-11-30 下午6:49
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe

管理员过滤
*/

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Filter02")
public class Filter02 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        Object o=request.getSession().getAttribute("SuccessAdmin");
        if(o==null){
            request.getSession().setAttribute("msgAdmin","<font color='red'>请登录管理员账号！</font>");
            ((HttpServletResponse)resp).sendRedirect(req.getServletContext().getContextPath()+"/index.jsp");
        }else{
            chain.doFilter(req, resp);//有管理员 权限，放行
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
