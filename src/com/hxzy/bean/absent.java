package com.hxzy.bean;

import java.sql.Date;
import java.util.Objects;

public class absent {
    private int id;		//编号
    private Date begin;		//请假起始时间
    private Date end;		//请假结束时间
    private employee e_id;		//旷工人

    public absent(int id, Date begin, Date end, employee e_id) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.e_id = e_id;
    }

    @Override
    public String toString() {
        return "absent{" +
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
        absent absent = (absent) o;
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

    public employee getE_id() {
        return e_id;
    }

    public void setE_id(employee e_id) {
        this.e_id = e_id;
    }

    public absent() {
    }
}
