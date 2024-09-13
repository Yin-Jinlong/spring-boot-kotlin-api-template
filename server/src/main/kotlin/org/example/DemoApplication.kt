package org.example

import io.github.yinjinlong.spring.boot.annotations.UseWrappedReturnValue
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@UseWrappedReturnValue
@SpringBootApplication(scanBasePackages = ["io.github.yinjinlong.spring.boot"])
class DemoApplication {

    @GetMapping("/")
    fun home() = null

    @GetMapping("/ok")
    fun ok() = Data("test", "hello")

    @GetMapping("/err")
    fun error(): Nothing = TODO()

}

data class Data(
    val name: String,
    val msg: String
)

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
