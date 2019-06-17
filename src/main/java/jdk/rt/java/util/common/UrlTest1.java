package jdk.rt.java.util.common;

import cn.hutool.http.HttpUtil;
import cn.hutool.setting.Setting;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/2/25 10:17
 * @Description:
 */
public class UrlTest1 implements Serializable{

    public static void main(String[] args) {
        Setting setting = new Setting("url.properties");
        String url = setting.get("sina.url");
        String content = HttpUtil.get(url);

        System.out.println(content);

        Map<String, Object> map = new HashMap<>();
        map.put("type", "01");
        map.put("key", "value");
        System.out.println(map.toString());
    }

}