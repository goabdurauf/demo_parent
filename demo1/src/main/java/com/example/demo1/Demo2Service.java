package com.example.demo1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(url = "http://demo2")
public interface Demo2Service {


    @PostMapping("message/{id}")
    public MessageDemo2Dto message(@PathVariable Long id);


    @GetMapping
    public String hello();


}
