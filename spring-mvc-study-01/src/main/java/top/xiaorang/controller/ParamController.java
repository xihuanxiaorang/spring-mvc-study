package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.xiaorang.pojo.UserDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;

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
    public String param2(@RequestParam("n") String username, @RequestParam("a") Integer age) {
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

    @RequestMapping(value = "/param5")
    public String param5(String username, Date birthday) {
        System.out.println(username);
        System.out.println(birthday);
        return "result";
    }

    @RequestMapping(value = "/param6")
    public String param6(@RequestParam MultiValueMap<String, String> params) {
        System.out.println(params);
        return "result";
    }

    @RequestMapping(value = "/param7")
    public String param7(@CookieValue("name") String value) {
        System.out.println(value);
        return "result";
    }

    @RequestMapping(value = "/param8")
    public String param8(@RequestHeader("Host") String host) {
        System.out.println(host);
        return "result";
    }
}
