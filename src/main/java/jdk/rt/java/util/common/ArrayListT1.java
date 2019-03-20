package jdk.rt.java.util.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/2/25 8:57
 * @Description: ArrayList
 * 1.是由数组实现的(数组动态扩容，Arrays.copy();)
 * 2.数组是内存中连续的存储空间、由索引(下标)表示该数据和第一个元素的偏移量
 * 3.ArrayList是随机访问的(实现了RandomAcess接口，LinkedList未实现，Collections.binarySearch()方法)
 * 4.访问速度快、删除修改速度慢
 * 5.ArrayList的Object[] elementData 是transient的，避免自动序列化空串，而是使用自己内置的序列化和反序列化方法
 * 6.arrayList创建用时:
    6214
    arrayList9800000
    查找用时:
    0
 */
public class ArrayListT1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        long createTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            list.add("arrayList" + i);
        }
        System.out.println("arrayList创建用时:");
        System.out.println(System.currentTimeMillis() - createTime);

        long start = System.currentTimeMillis();
        System.out.println(list.get(9800000));
        System.out.println("查找用时:");
        System.out.print(System.currentTimeMillis() - start);
    }
}