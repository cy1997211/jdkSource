package common.util.jwt;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package common.util.jwt
 * @date 2019/6/13 22:09
 * @Description:
 */
public class Person {
    private String name;
    private String tel;
    private String score;

    public Person(String name,String tel,String score){
        this.name = name;
        this.tel =tel;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}