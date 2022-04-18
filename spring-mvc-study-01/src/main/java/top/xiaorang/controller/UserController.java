package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.xiaorang.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liulei
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.PUT})
    public String add(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("UserController#add");
        return "result";
    }

    @RequestMapping(value = "query", method = RequestMethod.GET)
    public String query(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("UserController#query");
        return "result";
    }

    @RequestMapping(value = "/register")
    public String register(User user) {
        System.out.println(user);
        return "result";
    }
}
