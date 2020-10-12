package com.example.test

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMappingF
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus


@Controller
//@RequestMapping("")
class Handler (){
//    @ExceptionHandler(NotFoundException::class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    fun notfound():String="movie/notFound/index"

    @GetMapping("")
    fun index(model: Model):String{
//        val movies = connectMovieStatus.showAll()
//        model.addAttribute("movies",movies)
        return "movie/index"
    }
}