package org.hlx.demo.netty.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.nio.charset.Charset;

/**
 * 
 * 
 *
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) {
        // 数据解码操作
        channel.pipeline().addLast(new HttpResponseEncoder());
        // 数据编码操作
        channel.pipeline().addLast(new HttpRequestDecoder());
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyServerHandler());
    }

}
