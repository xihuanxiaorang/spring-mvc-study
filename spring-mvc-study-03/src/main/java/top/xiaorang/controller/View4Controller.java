package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import top.xiaorang.pojo.User;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/view4")
@SessionAttributes(value = "name")
public class View4Controller {
    @RequestMapping("/view1")
    public String view1(@ModelAttribute("name") String name) {
        return "result3";
    }

    @RequestMapping("/view2")
    public String view2(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "result3";
    }

    @RequestMapping("/view3")
    public String view3(@ModelAttribute("u") User user) {
        System.out.println(user);
        return "result3";
    }
}
