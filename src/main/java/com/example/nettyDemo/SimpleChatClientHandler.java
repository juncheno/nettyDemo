package com.example.nettyDemo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 
 * 
 * @author chen
 * @date  2018年11月12日
 */
public class SimpleChatClientHandler extends SimpleChannelInboundHandler<String> {
	
	protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
        System.out.println(s);
    }

}
