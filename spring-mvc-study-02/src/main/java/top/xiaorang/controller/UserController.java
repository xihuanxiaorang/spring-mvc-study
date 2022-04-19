package top.xiaorang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xiaorang.entity.User;
import top.xiaorang.service.UserService;

/**
 * @author liulei
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/register")
    public String register(User user) {
        userService.register(user);
        return "regOk";
    }
}
