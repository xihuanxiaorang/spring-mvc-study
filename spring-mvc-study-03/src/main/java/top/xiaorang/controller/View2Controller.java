package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/view2")
public class View2Controller {
    @RequestMapping("/view1")
    public String view1(Model model) {
        model.addAttribute("name", "小让");
        return "result1";
    }

    @RequestMapping("/view2")
    public String view2(ModelMap modelMap) {
        modelMap.addAttribute("name", "小让");
        return "result1";
    }
}
