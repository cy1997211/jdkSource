package jdk.rt.java.util.common;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/4/1 17:58
 * @Description:
 */
public class PacBase {
    private String pacAdd;
    private String pacType;
    private String pacName;

    public String getPacAdd() {
        return pacAdd;
    }

    public void setPacAdd(String pacAdd) {
        this.pacAdd = pacAdd;
    }

    public String getPacType() {
        return pacType;
    }

    public void setPacType(String pacType) {
        this.pacType = pacType;
    }

    public String getPacName() {
        return pacName;
    }

    public void setPacName(String pacName) {
        this.pacName = pacName;
    }

    @Override
    public String toString() {
        return "PacBase{" +
                "pacAdd='" + pacAdd + '\'' +
                ", pacType='" + pacType + '\'' +
                ", pacName='" + pacName + '\'' +
                '}';
    }
}