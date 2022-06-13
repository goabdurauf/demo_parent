package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    private final Demo2Service demo2Service;

    @Autowired
    public TestController(Demo2Service demo2Service) {
        this.demo2Service = demo2Service;
    }

    @GetMapping
    public ResponseEntity helloController() {
        String hello = demo2Service.hello();
        return ResponseEntity.ok(hello);
    }

    @GetMapping("/message")
    public MessageDto message(Long id) {
        MessageDemo2Dto message = demo2Service.message(id);
        assert message != null;
        return new MessageDto(message.getId(), message.getMessage(), new Date().getTime());
    }
}
