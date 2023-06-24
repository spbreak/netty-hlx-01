package org.hlx.demo.netty.util;

import org.hlx.demo.netty.domain.MsgInfo;

/**
 * 
 * 
 * 
 * 
 */
public class MsgUtil {

    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}
