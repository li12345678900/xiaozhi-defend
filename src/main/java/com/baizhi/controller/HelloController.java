package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("baby")
    // 跨域请求允许的注解
//    @CrossOrigin(value = "*")
    public Map<String, Object> baby() {
        System.out.println("===hello baby===");

        return result("HI baby");
    }

    public Map<String, Object> result(Object obj) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", obj);
        result.put("message", "操作成功！~");
        result.put("status", 100);
        return result;
    }
}
