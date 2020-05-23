package com.github.qichengjian.guava.event;

import com.google.common.eventbus.Subscribe;

/**
 * 消息订阅类
 */
public class MyListener {

    public String listenMessage;

    @Subscribe
    public void listen(MyEvent eventTest) {
        listenMessage = eventTest.getMessage();
        System.out.println("listen message: " + listenMessage);
    }

    @Subscribe
    public void listenBoolean(boolean flag) {
        System.out.println("listenBoolean: " + flag);
    }

    @Subscribe
    public void listInteger(Integer integer) {
        System.out.println("listenInteger: " + integer);
    }

    @Subscribe
    public void listenLong(Long number) {
        System.out.println("listenLong: " + number);
    }

    public String getListenMessage() {
        return listenMessage;
    }
}
