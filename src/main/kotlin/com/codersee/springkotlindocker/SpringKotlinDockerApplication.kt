package com.codersee.springkotlindocker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinDockerApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinDockerApplication>(*args)
}
