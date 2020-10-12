package com.example.kotlinspringbootdomademo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class homeController {
    @GetMapping("")
    fun index(model: Model): String {
        model.addAttribute("message","hello")
        return "home"
    }
}