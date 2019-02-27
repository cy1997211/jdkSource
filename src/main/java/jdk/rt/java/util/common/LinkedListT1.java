package jdk.rt.java.util.common;

import java.util.LinkedList;
import java.util.List;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/2/25 8:57
 * @Description:
 * 1.双向链表实现(数据在内存中是不连续的)
 * 2.
 */
public class LinkedListT1 {

    public static void main(String[] args) {
        List<String> list = new LinkedList();
        long createTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            list.add("linkedList" + i);
        }

        System.out.println("linkedList创建用时：");
        System.out.println(System.currentTimeMillis() - createTime);

        long start = System.currentTimeMillis();
        System.out.println(list.get(980000));
        System.out.println("查找用时:");
        System.out.print(System.currentTimeMillis() - start);
    }
}