package org.hlx.demo.netty.service;

import org.hlx.demo.netty.domain.MsgAgreement;
import org.hlx.demo.netty.redis.Publisher;
import org.hlx.demo.netty.redis.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 扩展服务
 * 
 * 
 * 
 * 
 */
@Service("extServerService")
public class ExtServerService {

    @Resource
    private Publisher publisher;
    @Resource
    private RedisUtil redisUtil;

    public void push(MsgAgreement msgAgreement){
        publisher.pushMessage("itstack-demo-netty-push-msgAgreement", msgAgreement);
    }

    public RedisUtil getRedisUtil() {
        return redisUtil;
    }
}
