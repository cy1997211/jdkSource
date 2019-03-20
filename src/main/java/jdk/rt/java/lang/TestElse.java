package jdk.rt.java.lang;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import com.sun.xml.internal.ws.developer.SerializationFeature;
import jdk.rt.java.lang.javaKeyWord.Animal;
import jdk.rt.java.lang.javaKeyWord.Dog;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang
 * @date 2019/2/28 9:06
 * @Description:
 */
public class TestElse {

    public static void main(String[] args) {
//       testBigDecimal();
//       testMap();
//        testBean2Json();

//        testGetList();



    }


    public static void testGetList(){
        List<Dog> list = new ArrayList<>();

        System.out.println(list.get(0).getAddr());
    }


    //将bean转换为json
    public static void testBean2Json(){
        Animal animal = new Animal();
        String json = JSONObject.toJSONString(animal, SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteBigDecimalAsPlain,SerializerFeature.WriteNullNumberAsZero);

        System.out.println(json);
    }

    public static void testMap(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", "key");
        map.put("value", 500);
        String str = String.valueOf(map.get("kk"));
        System.out.println(str);
    }


    //测试bigDecimal
    public static void testBigDecimal(){
        BigDecimal total = new BigDecimal("-0.0000000000000001");
        if(total.compareTo(new BigDecimal("0")) <= 0){
            total = total.compareTo(new BigDecimal("0"))<=0 ? new BigDecimal("0"):total;

            System.out.println("total为" + total);
        }

    }

    public static void testDouble(){
        double credit = 0.0;
        String str = "";
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("4");
        list.add("3");
        if(list != null && list.size() > 0){
            for(String s : list){
                if("1".equals(s)){
                    credit += 1;
                    System.out.println("credit1");
                }
                if("2".equals(s)){
                    credit += 2;
                    System.out.println("credit2");
                }
                if("3".equals(s)){
                    credit += 3;
                    System.out.println("credit3");
                }
            }
        }
        System.out.println(credit);
    }



}