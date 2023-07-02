package org.hlx.demo.netty.server;

import io.netty.channel.*;
import io.netty.channel.socket.SocketChannel;
import org.hlx.demo.netty.server.common.MyServerCommonHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/**
 * 
 * 
 * 
 */
public class MyServerHandler extends MyServerCommonHandler {

    @Override
    protected void sendData(ChannelHandlerContext ctx) {
        sentFlag = true;
        ctx.writeAndFlush( "1\r\n", getChannelProgressivePromise(ctx, new Consumer<ChannelProgressiveFuture>() {
            @Override
            public void accept(ChannelProgressiveFuture channelProgressiveFuture) {
                if (ctx.channel().isWritable() && !sentFlag) {
                    sendData(ctx);
                }
            }
        }));
    }

}
