package jdk.rt.java.util.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @program: jdkSource
 * @author: teamsun_wangwei
 * @description:
 * @create: 2019/2/16 11:56
 **/
public class ListT1 {

    public static void main(String[] args) {
//        vector();
        arrayList();
        linkedList();
    }

    /**
     * 1.双向链表实现
     * 2.适合删除和更新
     */
    public static void linkedList(){
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("张老师");
        linkedList.add("王老师");
        linkedList.add("李老师");
        linkedList.add("赵老师");

        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
    }

    /**
     * 1.数组实现
     * 2.线程不安全
     * 3.不适合插入或删除操作
     */
    public static void arrayList(){
        List<String> list = new ArrayList<String>();

        list.add("张老师");
        list.add("王老师");
        list.add("李老师");
        list.add("赵老师");

        System.out.println("arrayList" + list.toString());
        System.out.println(list.size());
    }

    /**
     * 1.数组实现
     * 2.线程安全
     * 3.不适合插入或删除操作
     */
    public static void vector(){
        Vector<String> vector = new Vector<String>();

        vector.add("A1");
        vector.add("B1");
        vector.add("C1");
        vector.remove("A1");

        System.out.println(vector);
        System.out.println(vector.size());
    }
}
