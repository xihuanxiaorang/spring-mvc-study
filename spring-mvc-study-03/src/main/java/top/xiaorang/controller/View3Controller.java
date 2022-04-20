package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/view3")
@SessionAttributes(value = {"name", "age"})
public class View3Controller {
    @RequestMapping("/view1")
    public String view1(Model model) {
        // 存放在session域和request域中
        model.addAttribute("name", "小让");
        // 存放在request域中
        model.addAttribute("address", "火星");
        return "forward:/view3/view2";
    }

    @RequestMapping("/view2")
    public String view2(SessionStatus sessionStatus) {
        if (!sessionStatus.isComplete()) {
            // 清除session作用域中的所有数据
            sessionStatus.setComplete();
        }
        return "result2";
    }
}
