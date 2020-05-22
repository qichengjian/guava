package com.github.qichengjian.guava.multi;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

/**
 * 用于简化Map<String,List<Object>>这种复杂集合类型的数据操作
 */
public class MultiMapTest {

    public static void main(String[] args) {
        Multimap multiMap = ArrayListMultimap.create();//创建一个value是list的hashmap
        HashMultimap.create();//创建一个value是set的hashmap
        TreeMultimap.create();//创建一个value是treeSet的treeMap
        for (int i = 0; i <3 ; i++) {
            multiMap.put("a", i);//直接往key对于的list中加数据
        }

        System.out.println(multiMap.size());//3
        System.out.println(multiMap.keys());//[a x 3]
        System.out.println(multiMap.containsKey("a"));//true
        System.out.println(multiMap.get("a"));//[0,1,2]
    }
}
