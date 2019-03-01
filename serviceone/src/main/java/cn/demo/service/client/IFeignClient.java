package cn.demo.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-two")
public interface IFeignClient {

	@GetMapping("/test2")
    String test2();
}



