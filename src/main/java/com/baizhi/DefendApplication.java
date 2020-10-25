package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 扫描servlet的原生注解
@ServletComponentScan
public class DefendApplication {
    public static void main(String[] args) {
        SpringApplication.run(DefendApplication.class, args);
    }
}
