package org.hlx.demo.test;

import org.hlx.demo.netty.service.NettyServer;

/**
 * 
 * 
 * 
 * 
 */
public class NettyServerTest {

    public static void main(String[] args) {
        System.out.println("hi ");
        //启动服务
            new NettyServer().bing(7397);
    }

}
