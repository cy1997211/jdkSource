package jdk.rt.java.util.common;

import cn.hutool.http.HttpUtil;
import cn.hutool.setting.Setting;

import java.io.Serializable;

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

    }

}