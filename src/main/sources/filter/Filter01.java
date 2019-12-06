package filter;/*
@author 孙朝辉
@create 2019-11-27 下午5:27
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

//字体编码过滤器

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter01")
public class Filter01 implements Filter {
    private String encoding;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding(encoding);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        encoding=config.getInitParameter("Encoding");
    }

}
