package com.codersee.springkotlindocker.controller

import com.codersee.springkotlindocker.model.PersonResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
class PersonController {

   val personId = AtomicInteger()

   @GetMapping("/person")
   fun getPerson(@RequestParam(value = "name", defaultValue = "Foo") name: String) =
           PersonResponse(personId.incrementAndGet(), name)
}