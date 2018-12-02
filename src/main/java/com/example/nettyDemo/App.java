package com.example.nettyDemo;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Random;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//    //复合缓冲区
////    System.out.println( "Hello World!" );
////    ByteBuffer header = null;
//	ByteBuffer body = null;
////	ByteBuffer[] message = new ByteBuffer[]{header, body};
////	ByteBuffer message2= ByteBuffer.allocate(header.remaining()+body.remaining());
////	message2.put(header);
////	message2.put(body);
////	message2.flip();
////	//compositeByteBuf
////	CompositeByteBuf messageBuf= Unpooled.compositeBuffer();
////	ByteBuf headerBuf = null;
////	ByteBuf bodyBuf = null;
////	messageBuf.addComponents(headerBuf, bodyBuf);
////	messageBuf.removeComponent(0);
////	for (ByteBuf byteBuf : messageBuf) {
////		System.out.println(byteBuf.toString());
////	}
////	//
////	CompositeByteBuf comBuf= Unpooled.compositeBuffer();
////	int length = comBuf.readableBytes();
////	byte[] array=new byte[length];
////	comBuf.getBytes(comBuf.readerIndex(), array);
////	    Random random = new Random();
////    	ByteBuf bodyBuf = Unpooled.buffer(8);
////    	while (bodyBuf.writableBytes() > 4) {
////			bodyBuf.writeInt(random.nextInt());
////		}
//////    	while (bodyBuf.isReadable()) {
//////			System.out.println(bodyBuf.readByte());
//////		}
////    	System.out.println(bodyBuf.readerIndex());
////    	System.out.println(bodyBuf.readByte());
////    	System.out.println(bodyBuf.readerIndex());
//    	
//    	//lizi
//    	ByteBuf buffer=Unpooled.copiedBuffer("n", Charset.forName("UTF-8"));
//    	System.out.println("refc1"+buffer.refCnt());
//    	System.out.println(buffer.writerIndex());
//    	buffer.writeByte('?');
//    	System.out.println(buffer.writerIndex());
//    	while (buffer.isReadable()) {
//		System.out.println((char)buffer.readByte());
//	}
//    	System.out.println("refc2"+buffer.refCnt());
//    	System.out.println("refc2"+buffer.release(2));
////    	System.out.println("refc2"+buffer.release());
//    }
}
