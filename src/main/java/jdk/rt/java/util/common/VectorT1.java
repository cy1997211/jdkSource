package jdk.rt.java.util.common;

import java.util.Vector;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/2/27 9:04
 * @Description:
 * 1.arrayList的线程同步的类
 * 2.6274 ms
    10000000
 */
public class VectorT1 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        long start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            vector.add("vector" + i);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(vector.size());

    }



}