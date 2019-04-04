package jdk.rt.java.util.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/4/1 17:59
 * @Description:
 */
public class TestGetListValue {

    public static void main(String[] args) {
        List<PacBase> list = new ArrayList<>();
        PacBase pacBase1 = new PacBase();
        pacBase1.setPacAdd("/nfs/01");
        pacBase1.setPacName("01");
        pacBase1.setPacType("01");
        list.add(pacBase1);

        PacBase pacBase2 = new PacBase();
        pacBase2.setPacAdd("/nfs/02");
        pacBase2.setPacName("02");
        pacBase2.setPacType("02");
        list.add(pacBase2);

        PacBase pacBase3 = new PacBase();
        pacBase3.setPacAdd("/nfs/03");
        pacBase3.setPacName("03");
        pacBase3.setPacType("03");
        list.add(pacBase3);

        PacBase pacBase4 = new PacBase();
        pacBase4.setPacAdd("/nfs/04");
        pacBase4.setPacName("04");
        pacBase4.setPacType("04");
        list.add(pacBase4);

        Map<String, Object> map = new HashMap<>();
        for(PacBase pac : list){
            map.put(pac.getPacType(), pac.getPacAdd());
        }
        System.out.println(map.get("03"));
        System.out.println(list.toString());
    }


}