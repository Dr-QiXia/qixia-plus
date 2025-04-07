package com.qx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qx.mapper")
public class QixiaPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(QixiaPlusApplication.class, args);
    }

}
