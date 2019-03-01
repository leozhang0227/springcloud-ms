package cn.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.service.client.IFeignClient;

/**
 * @Author: Harry
 * @Description:
 */
@RestController
public class ServiceController {

    @Autowired
    IFeignClient feignClient;
	
	@GetMapping("test")
    String test() {
        return "Hello world from service one!";
    }
    
    @GetMapping("test2")
    String test2() {
      return feignClient.test2();
    }

}
