package jdk.rt.java.lang.javaKeyWord;

import java.io.Serializable;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang.javaKeyWord
 * @date 2019/2/28 9:36
 * @Description:
 */
public class ServiceException extends RuntimeException implements Serializable{

    private String code;

    public ServiceException(String code,String mesage){
        super(mesage);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}