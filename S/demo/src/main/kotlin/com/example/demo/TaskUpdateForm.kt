package com.example.demo

//import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size
import javax.validation.constraints.NotBlank

class TaskUpdateForm {
    @NotBlank
    @Size(max = 20)
    var content: String? = null
    var done:Boolean =false
}