package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    @RequestMapping("/forward")
    public String view1() {
        System.out.println("view1");
        return "forward:/result.jsp";
    }

    @RequestMapping("/redirect")
    public String view2() {
        System.out.println("view2");
        return "redirect:/result.jsp";
    }
}
