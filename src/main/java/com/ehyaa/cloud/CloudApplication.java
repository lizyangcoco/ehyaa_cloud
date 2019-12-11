package com.ehyaa.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class CloudApplication {
    private static Logger logger = Logger.getLogger(String.valueOf(CloudApplication.class));


    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
        logger.info("==============================项目启动成功！！！=====>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
