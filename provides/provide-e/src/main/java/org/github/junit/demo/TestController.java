package org.github.junit.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping(value = "/user", produces = "application/json;charset=UTF-8")
    public Object getUser() {
        System.out.println("org.github.junit.demo.TestController.getUser");
        return "zhangkai";
    }
}
