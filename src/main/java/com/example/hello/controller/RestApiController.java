package com.example.hello.controller;


import com.example.hello.dto.User00;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/")
public class RestApiController {


    @GetMapping("/method/{id}")
    public String  get(@PathVariable Long id, @RequestParam String name){
        log.info("get method ");
        log.info("get method - id : {}", id);
        log.info("get method - name : {}", name);

        return id + " " + name;
    }


    @PostMapping("/method/post")
    public User00 post(@RequestBody User00 user){
        log.info("user : {}", user);

        return user;
    }

}// end class
