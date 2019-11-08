package com.aecoplus.gitexercise.modules.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aecoplus
 * @since 2019-11-08 21:51
 */
@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    @GetMapping("/test")
    public String test(){
        log.info("get the request");
        return "test";
    }
}
