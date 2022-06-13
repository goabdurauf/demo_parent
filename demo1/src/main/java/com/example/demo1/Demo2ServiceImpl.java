//package com.example.demo1;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class Demo2ServiceImpl implements Demo2Service {
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Override
//    public MessageDemo2Dto message(Long id) {
//        return restTemplate.postForObject("http://demo2/message/" + id, null, MessageDemo2Dto.class);
//    }
//
//    @Override
//    public String hello() {
//        return "hello from demo1 " + restTemplate.getForObject("http://demo2", String.class);
//    }
//
//
//}
