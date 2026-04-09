package com.dorm.be;

import com.dorm.fw.DormUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DormBeApplication {
    public static void main(String[] args) {
        System.out.println(DormUtil.hello());
        SpringApplication.run(DormBeApplication.class, args);
    }
}
