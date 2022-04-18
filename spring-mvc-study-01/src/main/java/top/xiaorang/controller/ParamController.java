package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xiaorang.pojo.UserDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(value = "/param1")
    public String param1(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username：" + username + "\r\n" + "password：" + password);
        return "result";
    }

    @RequestMapping(value = "/param2")
    public String param2(String username, Integer age) {
        System.out.println("username：" + username + "\r\n" + "age：" + age);
        return "result";
    }

    @RequestMapping(value = "/param3")
    public String param3(ArrayList<Integer> ids) {
        System.out.println(ids);
        return "result";
    }

    @RequestMapping(value = "/param4")
    public String param4(UserDto userDto) {
        System.out.println(userDto);
        return "result";
    }
}
