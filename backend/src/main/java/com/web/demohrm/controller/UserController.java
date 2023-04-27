package com.web.demohrm.controller;

import com.web.demohrm.model.User;
import com.web.demohrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/home")
    public String home(Model m) {
        List<User> list = userService.listUser();
        m.addAttribute("listUser",list);
        return "home";
    }
}
