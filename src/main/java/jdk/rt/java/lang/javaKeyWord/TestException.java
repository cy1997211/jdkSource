package jdk.rt.java.lang.javaKeyWord;

import java.util.ArrayList;
import java.util.List;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang.javaKeyWord
 * @date 2019/5/31 16:38
 * @Description:
 */
public class TestException {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("01");
        list.add("02");
        list.add("03");
        list.add("04");
        list.add("05");
        Integer count = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("07")){
                ++count;
            }
            if(list.get(i).equals("08")){
                ++count;
            }
            if(list.get(i).equals("05")){
                ++count;
            }
        }

        System.out.println("统计出:" + count);

    }

}