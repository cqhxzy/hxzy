package com.hxzy.bean;

import java.sql.Date;
import java.util.Objects;

public class attendance {
    private int id; //编号
    private employee e_id;// 员工编号;被考勤人

    @Override
    public String toString() {
        return "attendance{" +
                "id=" + id +
                ", e_id=" + e_id +
                ", start=" + start +
                ", leave=" + leave +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        attendance that = (attendance) o;
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

    public employee getE_id() {
        return e_id;
    }

    public void setE_id(employee e_id) {
        this.e_id = e_id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getLeave() {
        return leave;
    }

    public void setLeave(Date leave) {
        this.leave = leave;
    }

    public attendance() {
    }

    public attendance(int id, employee e_id, Date start, Date leave) {
        this.id = id;
        this.e_id = e_id;
        this.start = start;
        this.leave = leave;
    }

    private Date start;// 上班时间
    private Date leave;// 下班时间

}
