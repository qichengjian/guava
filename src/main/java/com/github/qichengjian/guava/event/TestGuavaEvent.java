package com.github.qichengjian.guava.event;

import com.google.common.eventbus.EventBus;

public class TestGuavaEvent {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus("test");
        MyListener listener = new MyListener();

        eventBus.register(listener);
        eventBus.register(new MyNumberListener());
        //发送事件
        eventBus.post(new MyEvent("hello"));
        eventBus.post(new MyEvent("world"));
        eventBus.post(new MyEvent("!"));

        eventBus.post(true);
        eventBus.post(66);
        eventBus.post(666L);

        eventBus.post(new Integer(77));




        System.out.println(listener.getListenMessage());
    }
}
