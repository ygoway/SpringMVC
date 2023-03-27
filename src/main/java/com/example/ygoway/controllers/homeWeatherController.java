package com.example.ygoway.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeWeatherController {

    @RequestMapping("/home/{color}")
    public String homeWeather(Model page,
                              @RequestParam int degreesNumber,
                              @PathVariable(required = false) String color,
                              @RequestParam String degrees) {
        page.addAttribute("degreesNumber", degreesNumber);
        page.addAttribute("color", color);
        page.addAttribute("degrees", degrees);
        return "home.html";
    }
}
