package com.github.qichengjian.guava.optional;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Optional 优雅处理null情况
 */
public class OptionalTest {

    /**
     * 实际中使用
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3,null,5,null,7);
        //所有数的总和
        int sum = 0;
        //非空数的个数
        int total = 0;
        for (Integer integer : list) {
            Optional<Integer> optional = Optional.fromNullable(integer);
            sum += optional.or(0);
            if (optional.isPresent()) {
                total++;
            }
        }
        System.out.println("总和sum："+sum);
        System.out.println("非null个数total："+total);
    }

    public void createOptional() {
        Integer integer = null;
        Optional.of(6);//获得一个Optional对象
        Optional.of(integer);//获得一个Optional对象，若参数为null，则立刻报错NPE

        Optional.fromNullable(integer);//获得一个Optional对象，参数可以为空
        Optional.fromNullable(null); //与Optional.absent()等价

        Optional.absent();//获得一个Optional对象，内部包含null

    }

    public void useOptional() {
        Optional optional = Optional.of(6);
        if (optional.isPresent()) { //判断Optional包含的T是否为null
            System.out.println("Optional value:" + optional.get());//返回Optional包含的T，如果T为null，则抛异常
        }
        optional.or(11);//如果Optional中T不为空则返回包含的T，如果T为空，则返回or中的值
        optional.orNull();//如果T不为空则则返回T，如果T为空，则返回null

        optional.asSet();//返回一个不可修改的Set 
    }




}


