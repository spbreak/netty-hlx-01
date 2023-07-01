package org.hlx.demo.netty.domain.protocol;

/**
 * 协议包
 * 
 * 
 * 
 * 
 */
public abstract class Packet {

    /**
     * 获取协议指令
     * @return 返回指令值
     */
    public abstract Byte getCommand();

}
