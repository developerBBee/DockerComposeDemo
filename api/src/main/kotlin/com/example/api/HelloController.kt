package com.example.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloController {
    @Autowired
    private lateinit var repository: GreetingRepository

    @RequestMapping("/hello")
    fun hello(@RequestParam lang: String): String {
        return runCatching {
            repository.findFirstByLang(lang = lang).text
        }
            .onFailure { println(it) }
            .getOrElse { "" }
    }
}