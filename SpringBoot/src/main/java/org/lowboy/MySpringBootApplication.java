package org.lowboy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// 主启动类
@SpringBootApplication
//@ImportResource("classpath:spring-legacy-config.xml")  // 导入 XML 配置
//@ComponentScan("**/controller/*.class, **/service/*.class ,**/dao/*.class")  // 扫描传统包
@MapperScan("org/lowboy/**/dao")
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}