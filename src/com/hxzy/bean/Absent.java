package com.hxzy.bean;

import java.sql.Date;
import java.util.Objects;

/**
 * 旷工类
 * @author 吴
 */
public class Absent {
    private int id;		//编号
    private Date begin;		//请假起始时间
    private Date end;		//请假结束时间
    private Employee e_id;		//旷工人

    public Absent(int id, Date begin, Date end, Employee e_id) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.e_id = e_id;
    }

    @Override
    public String toString() {
        return "Absent{" +
                "id=" + id +
                ", begin=" + begin +
                ", end=" + end +
                ", e_id=" + e_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Absent absent = (Absent) o;
        return id == absent.id;
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

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Employee getE_id() {
        return e_id;
    }

    public void setE_id(Employee e_id) {
        this.e_id = e_id;
    }

    public Absent() {
    }
}
