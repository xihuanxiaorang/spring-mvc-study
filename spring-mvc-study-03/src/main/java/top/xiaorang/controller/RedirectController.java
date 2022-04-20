package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/redirect")
public class RedirectController {
    @RequestMapping("/redirect1")
    public String redirect1() {
        System.out.println("redirect1跳转到redirect2中");
        return "redirect:/redirect/redirect2";
    }

    @RequestMapping("/redirect2")
    public String redirect2() {
        System.out.println("redirect2跳转到jsp页面中");
        return "redirect:/result.jsp";
    }
}
