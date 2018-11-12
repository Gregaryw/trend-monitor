package com.trend;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/11/9
 */
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = {"tk.mybatis.mapper,com.sephome.*.mapper"})
public class TrendMonitorApplication {
    private static Logger logger = LoggerFactory.getLogger(TrendMonitorApplication.class);
    public static void main(String[] args) {
        logger.info("容器启动...");
        SpringApplication.run(TrendMonitorApplication.class,args);
    }
}
