package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/","","home","home.html"}) //jezeli zadanie bedzie pod te wszytski adresy to odpalona zostanie ta metoda
    private String home(){
        return "home";
    }
}
