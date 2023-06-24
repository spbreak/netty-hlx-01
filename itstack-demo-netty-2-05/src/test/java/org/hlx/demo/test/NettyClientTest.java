package org.hlx.demo.test;

import io.netty.channel.ChannelFuture;
import org.hlx.demo.netty.client.NettyClient;
import org.hlx.demo.netty.domain.FileTransferProtocol;
import org.hlx.demo.netty.util.MsgUtil;

import java.io.File;

/**
 * 
 * 
 * 
 * 
 */
public class NettyClientTest {

    public static void main(String[] args) {

        //启动客户端
        ChannelFuture channelFuture = new NettyClient().connect("127.0.0.1", 7397);

        //文件信息{文件大于1024kb方便测试断点续传}
        File file = new File("C:\\Users\\52710\\IdeaProjects\\netty-hlx-01\\file\\测试传输文件600k.rar");
        FileTransferProtocol fileTransferProtocol = MsgUtil.buildRequestTransferFile(file.getAbsolutePath(), file.getName(), file.length());

        //发送信息；请求传输文件
        channelFuture.channel().writeAndFlush(fileTransferProtocol);

    }

}
