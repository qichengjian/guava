package com.github.qichengjian.guava.event;

import com.google.common.eventbus.Subscribe;

/**
 * event继承，listener能同时监听event对象和event对象的子类事件
 *
 */
public class MyNumberListener {

    /**
     * 此时MyNumberListener能接受所有整形数据（int ，short，long ,因为Number是这些类型的父类）
     * @param number
     */
    @Subscribe
    public void listenNumber(Number number) {
        System.out.println("listenNumber: " + number);
    }
}
