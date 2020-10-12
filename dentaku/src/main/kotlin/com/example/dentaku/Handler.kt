package com.example.dentaku

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping


@Controller
class Handler {
    @GetMapping("")
    fun index(form: mathCreateForm): String {
        return "index"
    }

//    @PostMapping("")
//    fun get(@Validated form: mathCreateForm,bindingResult: BindingResult):String
//    {
//     if (bindingResult.hasErrors()) {
//         return "index"
//     }
//        val suusiki = requireNotNull(form.suusiki)
//
//        return "redirect:/index"
//    }
}