package org.hlx.demo.netty.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * 
 * 
 * 
 */
public class BioClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.116", 7397);
            System.out.println("itstack-demo-netty bio client start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
            BioClientHandler bioClientHandler = new BioClientHandler(socket, Charset.forName("utf-8"));
            bioClientHandler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
