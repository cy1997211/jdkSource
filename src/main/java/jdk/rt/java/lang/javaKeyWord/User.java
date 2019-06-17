package jdk.rt.java.lang.javaKeyWord;

import java.io.Serializable;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang.javaKeyWord
 * @date 2019/4/23 15:39
 * @Description:
 */
public class User implements Serializable{
    private static final long serialVersionUID = 8445579510376135029L;

    private String userName;
    private int age;
    private String address;
    private String cell;
    private Integer grade;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}