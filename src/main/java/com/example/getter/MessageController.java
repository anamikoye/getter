package com.example.getter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "peng")
public class MessageController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping


    @PostMapping
    public void createMessage (@RequestBody Message message){

    }
}
