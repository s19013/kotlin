package com.example.kotlinspringbootdomademo.application.controller.web

import com.example.kotlinspringbootdomademo.domain.repository.CustomerRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/customors")
class CustomerController (private val customerRepository: CustomerRepository){
    @GetMapping("")
    fun index(model: Model):String{
        val customers = customerRepository.findAll()
        model.addAttribute("customers",customers)
        return "customers/index"
    }
}