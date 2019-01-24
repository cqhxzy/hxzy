package com.hxzy.bean;

import java.sql.Date;
import java.util.Objects;

/**
 * 考勤明细表
 * @author yu
 */
public class Attendance {
    private int id; //编号
    private Employee e_id;// 员工编号;被考勤人
    private Date start;// 打卡时间
    private int type;// 打卡类型
    @Override
    public String toString() {
        return "attendance{" +
                "id=" + id +
                ", e_id=" + e_id +
                ", start=" + start +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendance that = (Attendance) o;
        return id == that.id;
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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Attendance() {
    }

    public Attendance(int id, Employee e_id, Date start, int type) {
        this.id = id;
        this.e_id = e_id;
        this.start = start;
        this.type = type;
    }



}
