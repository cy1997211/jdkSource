package jdk.rt.java.lang.javaKeyWord;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang.javaKeyWord
 * @date 2019/2/28 9:20
 * @Description: 使用super关键字操作父类的方法
 * 访问父类的变量
 */
public class Dog extends Animal {

    public Dog(){};

    public Dog(String name, int age){
        super(name, age);
    }

    public String getAddr(){
        new Animal();
        return super.getAddr();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("tt", 6);
        System.out.println(dog.toString());
        System.out.println(dog.getAddr());
    }

}