package org.hlx.demo.netty.util;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 消息传输协议
 * 
 * 
 * 
 * 
 */
public class ChannelHandler {

    //用于存放用户Channel信息，也可以建立map结构模拟不同的消息群
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}
