package cn.amos.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DaoyuanWang
 */
@SpringBootApplication
@MapperScan("cn.amos.boot.dao.mappers")
public class BootSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSingleApplication.class, args);
    }
}
