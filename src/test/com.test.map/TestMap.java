package com.test.map;

import jdk.rt.java.util.common.CustInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.test.map
 * @date 2019/3/1 12:43
 * @Description:
 */
public class TestMap {

    @Test
    public void testMap(){
        Map<String, Object> map = new HashMap<String, Object>();

        List<CustInfo> custInfoList = new ArrayList<CustInfo>();
        CustInfo custInfo = new CustInfo();
        custInfo.setCifName("ww");
        custInfo.setCifNo("66666");
        custInfo.setIdNo("511303");
        custInfo.setIdType("0");
        custInfoList.add(custInfo);
        custInfoList.add(custInfo);

        map.put("pactNo", "01001001");
        map.put("pactPlusNo", "11111");
        map.put("vouType", "020");
        map.put("custList", custInfoList);

        System.out.println(map);
        System.out.println(map.get("custList"));
    }




}