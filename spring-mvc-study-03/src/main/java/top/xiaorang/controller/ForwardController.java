package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/forward")
public class ForwardController {
    @RequestMapping("/forward1")
    public String forward1() {
        System.out.println("forward1跳转到forward2中");
        return "forward:/forward/forward2";
    }

    @RequestMapping("/forward2")
    public String forward2() {
        System.out.println("forward2跳转到jsp页面中");
        return "forward:/result.jsp";
    }
}
