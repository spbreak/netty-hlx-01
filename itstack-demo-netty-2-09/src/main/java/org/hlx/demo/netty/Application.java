package org.hlx.demo.netty;

import org.hlx.demo.netty.redis.RedisUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

/**
 * 消息传输协议
 * 
 * 
 * 
 * 
 */
@SpringBootApplication
@ComponentScan("org.hlx.demo.netty")
public class Application implements CommandLineRunner{

    @Resource
    private RedisUtil redisUtil;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        redisUtil.clear();
    }

}
