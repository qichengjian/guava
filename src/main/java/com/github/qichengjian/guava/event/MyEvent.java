package com.github.qichengjian.guava.event;


/**
 * EventBus是guava的事件处理机制，基于观察者模式
 * 使用guava，订阅消息不用继承指定接口，只需要在方法上加@Subscribe
 *
 * EventBus帮我们维护了订阅者列表
 * <p>
 * 消息封装类
 */
public class MyEvent {
    private String message;

    public MyEvent(String message) {
        this.message = message;
        System.out.println("event message: " + message);
    }

    public String getMessage() {
        return message;
    }
}
