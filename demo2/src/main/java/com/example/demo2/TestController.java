package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String helloController(){
        return "hello from demo2";
    }

    @PostMapping("message/{id}")
    public ResponseEntity message(@PathVariable Long id){
        MessageDto dto = new MessageDto();
        dto.setMessage("Message from demo2");
        dto.setId(id);
        return ResponseEntity.ok(dto);
    }
}
