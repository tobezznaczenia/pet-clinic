package com.example.petclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets/index","/vets","vets/index.html"})
    String listVets(){
        return "vets/index";
    }
}
