package com.youda.anchor.admin.socket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/8-9:39
 * @Version: v1.0.0
 * @Comment: Websock Server
 */
@ServerEndpoint("/echo")
public class EchoServer {

    @OnMessage
    public String echo(String incomingMessage) {
        return "I got this ("+incomingMessage +") so I am sending it back!";
    }

}
