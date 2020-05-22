package com.github.qichengjian.guava.preconditions;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Preconditions 优雅校验参数
 */
public class PreconditionsTest {
    public static void main(String[] args) {
        String name = "James";
        Preconditions.checkNotNull(name);
        name = null;
        Preconditions.checkNotNull(name, "name为null");

        int age = 35;
        Preconditions.checkArgument(age > 0);
        Preconditions.checkArgument(age > 0, "age必须70");

        Preconditions.checkState(age>18,"age>18才可以");

        List list= Lists.newArrayList(1,2);
        int index =4;
        //检查index是否为在一个长度为size的合法范围
        Preconditions.checkPositionIndex(index, list.size(), "下标越界");



    }
}
