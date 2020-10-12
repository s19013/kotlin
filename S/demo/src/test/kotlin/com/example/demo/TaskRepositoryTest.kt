package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.junit4.SpringRunner

@RunWith(value = SpringRunner::class)
@SpringBootTest
@Sql(statements = arrayOf("DELETE FROM task"))
class TaskRepositoryTest {

    @Autowired
    lateinit var sut: JdbcTaskRepository

    @Test
    fun returnEmptyList(){
        val got = sut.findAll()
        assertThat(got).isEmpty()
    }

    @Test
    fun getFindBYId(){
        val task = sut.create("TEST")
        val got =sut.findById(task.id)
        assertThat(got).isEqualTo(task)
    }
}