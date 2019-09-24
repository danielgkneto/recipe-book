package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/list-recipes")
    public String listRecipes() {
        return "list-recipes";
    }

    @RequestMapping("/crabcake")
    public String crabcake() {
        return "crabcake";
    }

    @RequestMapping("/cheese-bread")
    public String cheeseBread() {
        return "cheese-bread";
    }
}
