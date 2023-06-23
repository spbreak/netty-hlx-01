package org.hlx.demo.netty.util;

import org.hlx.demo.netty.domain.MsgBody;

/**
 * 
 * 
 * 
 */
public class MsgUtil {

    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }

}
