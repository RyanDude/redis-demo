package com.example.demo.Controller;

import com.example.demo.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    final TestService testService;

    public MyController(TestService testService) {
        this.testService = testService;
    }
    @GetMapping("/test")
    public void test(){
        this.testService.sendAMsg();
    }
}
