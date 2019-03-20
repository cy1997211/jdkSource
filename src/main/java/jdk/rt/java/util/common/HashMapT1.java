package jdk.rt.java.util.common;

import jdk.rt.java.lang.javaKeyWord.Animal;
import jdk.rt.java.lang.javaKeyWord.Dog;

import java.util.HashMap;
import java.util.Map;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/3/14 9:13
 * @Description:
 */
public class HashMapT1 {

    public static void main(String[] args) {
//        getProd();

        getProdName();
    }

    public static void getProdName(){
        Dog dog = new Dog();
        Animal animal = new Animal();
        dog.setName(animal == null ? "" : "ww");
        System.out.println(dog.toString());
    }

    public static void getProd(){
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("01", "A");
        map.put("02", "B");
        map.put("03", "C");

//        System.out.println(map.toString());

        map.forEach((key, value)->{
            System.out.println("key:" + key + ",value:" + value);
        });
    }

}