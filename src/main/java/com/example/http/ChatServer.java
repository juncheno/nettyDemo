package com.example.http;

import java.net.InetSocketAddress;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.ImmediateEventExecutor;

/**
 * 
 * 
 * @author chen
 * @date  2018年12月1日
 */
public class ChatServer {
	private final ChannelGroup channelGroup =
			new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);
	private final EventLoopGroup group = new NioEventLoopGroup();
	private Channel channel;
	
	public ChannelFuture start(InetSocketAddress address){
		ServerBootstrap bootstrap = new ServerBootstrap();
		bootstrap.group(group).channel(NioServerSocketChannel.class)
		.childHandler(createInitializer(channelGroup));
		ChannelFuture future =bootstrap.bind(address);
		future.syncUninterruptibly();
		channel =future.channel();
		return future;
		
	}

	private ChannelInitializer<Channel> createInitializer(ChannelGroup channelGroup) {
		
		return new ChatServerInitializer(channelGroup);
	}
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("please give port as argument");
			System.exit(1);
		}
		int port = Integer.parseInt(args[0]);
		final ChatServer endpoint =	new ChatServer();
		ChannelFuture future= endpoint.start(new InetSocketAddress(port));
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run(){
				endpoint.destory();
			}
		});
		future.channel().closeFuture().syncUninterruptibly();
	}

	protected void destory() {
		if (channel != null) {
			channel.close();
		}
		channelGroup.close();
		group.shutdownGracefully();
	}

}
