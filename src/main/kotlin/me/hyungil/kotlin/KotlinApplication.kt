package me.hyungil.kotlin

import me.hyungil.kotlin.configuration.BlogProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinApplication

fun main(args: Array<String>) {
    runApplication<KotlinApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
