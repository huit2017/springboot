package com.huit2017.springboot.rest

import com.huit2017.springboot.response.HomeResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class Home {

    @GetMapping("/")
    fun index(): ResponseEntity<HomeResponse> {
        // Swagger
        // return dto

        return ResponseEntity(HomeResponse("index"), HttpStatus.OK)
    }

    @GetMapping("/2")
    fun index2(): ResponseEntity<HomeResponse> {
        return ResponseEntity(HomeResponse("index2"), HttpStatus.OK)
    }
}