package com.ferguesson.spring_security.controllers;

import com.ferguesson.spring_security.models.User;
import com.ferguesson.spring_security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loginning")
public class RegistrationController {

    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String formRegistration() {
        return "loginning";
    }

    @PostMapping()
    public String form(User user) {
        userService.addUser(user);
        return "redirect:/login";
    }
}
