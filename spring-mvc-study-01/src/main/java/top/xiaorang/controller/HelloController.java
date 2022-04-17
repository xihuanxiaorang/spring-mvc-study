package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liulei
 */
@Controller
@RequestMapping("test")
public class HelloController {
    @RequestMapping(value = {"/first", "third"})
    public String first(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("HelloController#first");
        return "result";
    }

    @RequestMapping("xiaorang/second")
    public String second(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("HelloController#second");
        return "result";
    }
}
