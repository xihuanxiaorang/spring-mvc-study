package top.xiaorang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author liulei
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 作用域操作
        req.setAttribute("request-data", "requestData");
        HttpSession session = req.getSession();
        session.setAttribute("session-data", "sessionData");
        ServletContext application = session.getServletContext();
        application.setAttribute("application-data", "applicationData");

        // 页面跳转
        // 转发
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
        // 重定向
        resp.sendRedirect("/result.jsp");
    }
}
