package common.util.jwt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package common.util.jwt
 * @date 2019/6/13 22:10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        List<Person> list = getList();
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if("ww3".equals(person.getName())){
                person.setName("刘备");
            }
        }
        System.out.println(list.toString());
    }

    public static List<Person> getList(){
        Person p1 = new Person("ww1", "133", "A+");
        Person p2 = new Person("ww2", "666", "B-");
        Person p3 = new Person("ww3", "999", "C");
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;
    }

}