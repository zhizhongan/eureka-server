package com.example.eurekafeignuploadclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sam
 * @date 2019/9/2 15:04
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

}
