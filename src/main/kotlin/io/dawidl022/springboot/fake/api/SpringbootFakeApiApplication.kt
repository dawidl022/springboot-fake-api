package io.dawidl022.springboot.fake.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootFakeApiApplication

fun main(args: Array<String>) {
	runApplication<SpringbootFakeApiApplication>(*args)
}
