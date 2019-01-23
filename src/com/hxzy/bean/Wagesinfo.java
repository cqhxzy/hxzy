package com.hxzy.bean;

import java.sql.Date;
import java.util.Objects;

/**
 * 工资发放类
 * @author yu
 */
public class Wagesinfo {
    private  int id;  //编号
    private Employee e_id;   //员工编号
    private Date time;   //发放时间
    private double wages;  //实发金额
    private double deduct;//扣除金额

    @Override
    public String toString() {
        return "wagesinfo{" +
                "id=" + id +
                ", e_id=" + e_id +
                ", time=" + time +
                ", wages=" + wages +
                ", deduct=" + deduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wagesinfo wagesinfo = (Wagesinfo) o;
        return id == wagesinfo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getE_id() {
        return e_id;
    }

    public void setE_id(Employee e_id) {
        this.e_id = e_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public double getDeduct() {
        return deduct;
    }

    public void setDeduct(double deduct) {
        this.deduct = deduct;
    }

    public Wagesinfo() {
    }

    public Wagesinfo(int id, Employee e_id, Date time, double wages, double deduct) {
        this.id = id;
        this.e_id = e_id;
        this.time = time;
        this.wages = wages;
        this.deduct = deduct;
    }
}
