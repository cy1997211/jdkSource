package jdk.rt.java.util.common;

import java.util.Iterator;

public interface IterableT1<E> {

    Iterator<E> iterator();

    default void forEach(){
        System.out.println("jdk1.8");
    }

    static void spliterator(){
        System.out.println("jdk1.8");
    }
}
