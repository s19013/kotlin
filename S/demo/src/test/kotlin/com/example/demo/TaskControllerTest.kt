package com.example.demo

import org.hamcrest.Matchers
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@RunWith(SpringRunner::class)
@WebMvcTest(TaskController::class)
class TaskControllerTest{

    @Autowired
    private lateinit var mockMvc:MockMvc

    @MockBean
    private lateinit var taskRepository: TaskRepository

    @MockBean
    private lateinit var commandLineRunner: CommandLineRunner

    @Test
    fun showAll(){
        val tasks = listOf(
                Task(id = 123,content = "a",done = false),
                Task(id = 234,content = "b",done = true)
        )

        Mockito.`when`(taskRepository.findAll())
                .thenReturn(tasks)

        mockMvc.perform(MockMvcRequestBuilders.get("/tasks"))
                .andExpect(view().name("tasks/index"))
                .andExpect(model().attribute("tasks",tasks))
                .andExpect(content().string(Matchers.containsString("<span>a<span>")))
                .andExpect(content().string(Matchers.containsString("<s>b<s>")))
    }
    @Test
    fun createTest(){
        mockMvc.perform(MockMvcRequestBuilders.post("/tasks")
                .param("content","pi")).andExpect(redirectedUrl("/tasks"))
        Mockito.verify(taskRepository).create("pi")
    }
}
