package cn.xuyue.shirowithspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.xuyue.shirowithspringboot.mapper")
public class BootstrapbyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapbyspringbootApplication.class, args);
    }
}
