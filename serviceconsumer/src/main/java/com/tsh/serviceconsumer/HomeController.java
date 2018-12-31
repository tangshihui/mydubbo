package com.tsh.serviceconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tsh.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Reference
    private CityService cityService;

    @GetMapping("/provence/{provence}")
    public String getCity(@PathVariable("provence") String provence) {
        if (cityService == null) {
            return "dubbo服务为空";
        }

        return cityService.getShenghui(provence);

    }

    @GetMapping("/hello")
    public String hello() {
        return "hello,consumer";
    }
}
