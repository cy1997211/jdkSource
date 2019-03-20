package jdk.rt.java.util.common;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/3/13 9:01
 * @Description: list的删除方法 迭代器
 */
public class ArrayListT2<E> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.add("t4");
        list.add("t4");
        list.add("t5");

//        forSize(list);
//        forEach(list);
        iteratorDel(list);
    }

    /**
     * for循环删除
     * @param list
     */
    public static<E> void forSize(List<E> list){
        for (int i=0; i < list.size(); i++){
//            if("t4".equals(list.get(i))){
//                list.remove(i);
//            }
            list.remove(i);
        }
        System.out.println(list.toString());
    }

    /**
     * forEach方法
     * @param list
     */
    public static<E> void forEach(List<E> list){
        for (E e : list){
            if(e.equals("t4")){
                list.remove(e);
            }
        }
        System.out.println(list.toString());
    }

    /**
     *iterator迭代器删除
     */
    public static<E> void iteratorDel(List<E> list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String del = (String) iterator.next();
            if("t4".equals(del)){
                iterator.remove();
            }
        }
        System.out.println(list.toString());


    }


}