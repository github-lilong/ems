package com.baizhi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class EmsApplication {
    
    //This is test
    //测试是否有乱码
    
    
    
    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }

}
