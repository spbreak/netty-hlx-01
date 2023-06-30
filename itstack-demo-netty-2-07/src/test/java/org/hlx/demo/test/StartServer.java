package org.hlx.demo.test;

import org.hlx.demo.netty.server.ServerSocket;

/**
 * 
 * 
 * 
 * 
 */
public class StartServer {

    public static void main(String[] args) {
        new Thread(new ServerSocket()).start();
        System.out.println("itstack-demo-netty server start done. ");
    }

}
