package spring.controllers;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.threadlocal.MyService;

import javax.annotation.Resource;

@RestController
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/home")
    public String home() {
        int i = 1/0;
        return "back home";
    }


    @Resource
    private MyService myService;

    @GetMapping("/async")
    public String async() throws InterruptedException {
        myService.asyncExecutor();
        return "async";
    }
}
