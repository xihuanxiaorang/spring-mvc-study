package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/view6")
public class View6Controller {
    @RequestMapping("/view1")
    public String view1() {
        return "redirect:/result5";
    }
}
