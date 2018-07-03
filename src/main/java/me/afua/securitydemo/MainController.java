package me.afua.securitydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showIndex()
    {
        return "index";
    }

    @RequestMapping("/all")
    public String showAll()
    {
        return "index";
    }

    @RequestMapping("/user")
    public String showUser()
    {
        return "user";
    }

    @RequestMapping("/admin")
    public String showAdmin()
    {
        return "admin";
    }

}
