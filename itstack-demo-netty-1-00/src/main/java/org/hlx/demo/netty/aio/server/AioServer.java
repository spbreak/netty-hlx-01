package org.hlx.demo.netty.aio.server;

import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * 
 * 
 * 
 */
@Slf4j
public class AioServer extends Thread {
    
    private static Logger log = Logger.getLogger(AioServer.class.getName());

    private AsynchronousServerSocketChannel serverSocketChannel;

    @Override
    public void run() {
        
        try {
            serverSocketChannel = AsynchronousServerSocketChannel.open(AsynchronousChannelGroup.withCachedThreadPool(Executors.newCachedThreadPool(), 10));
            serverSocketChannel.bind(new InetSocketAddress(7397));
            System.out.println("demo-netty aio server start done.");
            // 等待
            CountDownLatch latch = new CountDownLatch(1);
            serverSocketChannel.accept(this, new AioServerChannelInitializer());
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AsynchronousServerSocketChannel serverSocketChannel() {
        return serverSocketChannel;
    }

    public static void main(String[] args) {
        log.info("调用: a:{} b:{}", "AA", "BB", "CC");
//        log.debug("调用d: a:{} b:{}", "AA", "BB", "CC");
        new AioServer().start();
    }

}
