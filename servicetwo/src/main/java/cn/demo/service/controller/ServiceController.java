package cn.demo.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Harry
 * @Description:
 */
@RestController
public class ServiceController {

    @GetMapping("test")
    String test() {
        return "Hello world from service two!";
    }
    
    @GetMapping("test2")
    String feignTest() {
        return "Hello world from service two!, call from service1";
    }

}
