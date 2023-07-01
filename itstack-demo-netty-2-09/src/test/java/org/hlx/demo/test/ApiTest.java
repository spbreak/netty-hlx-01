package org.hlx.demo.test;

import org.hlx.demo.netty.domain.MsgAgreement;
import org.hlx.demo.netty.util.MsgUtil;

/**
 * 
 * 
 * 
 * 
 */
public class ApiTest {

    public static void main(String[] args) {
        System.out.println("hlx");
        MsgAgreement msgAgreement = MsgUtil.buildMsg("6e0216ea", "hi! I'm hlx * 来自A服务端里用户向B服务端里用户发送信息。[结尾换行，用于处理半包粘包]");
        String json = MsgUtil.obj2Json(msgAgreement);
        System.out.println(json);
        //{"content":"hi! I'm hlx * 来自A服务端里用户向B服务端里用户发送信息。[结尾换行，用于处理半包粘包]","toChannelId":"6e0216ea"}
    }

}
