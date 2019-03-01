package jdk.rt.java.util.common;

import java.io.Serializable;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package jdk.rt.java.util.common
 * @date 2019/3/1 12:42
 * @Description:
 */
public class CustInfo implements Serializable{
    private static final long serialVersionUID = 4614653068675990178L;

    private String cifNo;
    private String cifName;
    private String idNo;
    private String idType;

    public String getCifNo() {
        return cifNo;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public String getCifName() {
        return cifName;
    }

    public void setCifName(String cifName) {
        this.cifName = cifName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    @Override
    public String toString() {
        return "CustInfo{" +
                "cifNo='" + cifNo + '\'' +
                ", cifName='" + cifName + '\'' +
                ", idNo='" + idNo + '\'' +
                ", idType='" + idType + '\'' +
                '}';
    }
}