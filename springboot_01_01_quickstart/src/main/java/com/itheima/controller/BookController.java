package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijie on 2021/11/25
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/id")
    public String getById() {
        System.out.println("SpringBoot is running...");
        return "SpringBoot is running..";
    }
}
