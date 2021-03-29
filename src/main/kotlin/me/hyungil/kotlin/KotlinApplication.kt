package me.hyungil.kotlin

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
    runApplication<HtmlController>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
