package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/view5")
public class View5Controller {
    @RequestMapping("/view1")
    public ModelAndView view1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModelMap().addAttribute("name", "xiaorang");
        modelAndView.setViewName("result4");
        return modelAndView;
    }
}
