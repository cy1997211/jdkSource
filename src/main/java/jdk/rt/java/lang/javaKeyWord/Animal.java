package jdk.rt.java.lang.javaKeyWord;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.lang.javaKeyWord
 * @date 2019/2/28 9:20
 * @Description:
 */
public class Animal {
    private String name;
    private int age;
    private String addr = "northArear";
    private Double price;

    public Animal(){
        this.addr = "north";
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, int age){
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("qq", 12);
        System.out.println(animal.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", price=" + price +
                '}';
    }
}