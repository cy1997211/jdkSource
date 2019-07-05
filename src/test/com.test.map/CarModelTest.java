package com.test.map;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.test.map
 * @date 2019/6/25 14:59
 * @Description:
 */
public class CarModelTest {

    @Test
    public void testGetCarInfo(){
        String body = "{'fromVersion':'3.6.1.1025'}";
        String url = "http://zlhjuat.viphk.ngrok.org/zlhj_interface/tfBank/carModel";
        String result = HttpUtil.post(url, body);

        CarInfo carInfo = JSON.parseObject(result, CarInfo.class);
        System.out.println(carInfo.toString());
        List<CarInfo.CarBrand> list = carInfo.getData().getBrand();
        System.out.println(list.size());
            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
        }

        body.replace("3.6.7", "tutuanna");
        System.out.println(body);

        System.out.println(carInfo.getFromVersion());
        System.out.println(carInfo);
    }

}