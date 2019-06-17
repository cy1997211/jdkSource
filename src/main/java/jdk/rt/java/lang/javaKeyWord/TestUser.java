package jdk.rt.java.lang.javaKeyWord;

import org.apache.commons.lang3.StringUtils;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang.javaKeyWord
 * @date 2019/4/23 15:54
 * @Description:
 */
public class TestUser {
    public static void main(String[] args) {
        User user1 = new User();

        System.out.println(user1.getAge());
        System.out.println(user1.getGrade());
        if(user1.getAge() > 0){
            System.out.println("age数据有问题");
        }

        if(user1.getGrade() == null){
            System.out.println("Integer数据为空");
        }



    }




}