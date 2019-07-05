package com.test.map;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;
import java.util.List;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.test.map
 * @date 2019/6/26 9:37
 * @Description:
 */
public class CarInfo implements Serializable{

    private String result;
    private String fromVersion;
    private Car data;

    static class Car{
        private List<Serial> serials;
        private List<Model> model;
        private List<CarBrand> brand;

        public List<Serial> getSerials() {
            return serials;
        }

        public void setSerials(List<Serial> serials) {
            this.serials = serials;
        }

        public List<Model> getModel() {
            return model;
        }

        public void setModel(List<Model> model) {
            this.model = model;
        }

        public List<CarBrand> getBrand() {
            return brand;
        }

        public void setBrand(List<CarBrand> brand) {
            this.brand = brand;
        }
    }

    public static class CarBrand {
        private String oper_type;
        private String brand_name;
        private String brand_initial;
        private String brand_id;

        public String getOper_type() {
            return oper_type;
        }

        public void setOper_type(String oper_type) {
            this.oper_type = oper_type;
        }

        public String getBrand_name() {
            return brand_name;
        }

        public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
        }

        public String getBrand_initial() {
            return brand_initial;
        }

        public void setBrand_initial(String brand_initial) {
            this.brand_initial = brand_initial;
        }

        public String getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(String brand_id) {
            this.brand_id = brand_id;
        }

        @Override
        public String toString() {
            return "CarBrand{" +
                    "oper_type='" + oper_type + '\'' +
                    ", brand_name='" + brand_name + '\'' +
                    ", brand_initial='" + brand_initial + '\'' +
                    ", brand_id='" + brand_id + '\'' +
                    '}';
        }
    }

    static class Serial{

    }

    static class Model{}

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFromVersion() {
        return fromVersion;
    }

    public void setFromVersion(String fromVersion) {
        this.fromVersion = fromVersion;
    }

    public Car getData() {
        return data;
    }

    public void setData(Car data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "result='" + result + '\'' +
                ", fromVersion='" + fromVersion + '\'' +
                ", data=" + data +
                '}';
    }
}