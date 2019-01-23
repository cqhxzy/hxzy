package com.hxzy.bean;

import java.util.Date;
import java.util.Objects;

/**
 * 请假信息表类
 */
public class AskForLeave {
    private int id;
    private int type;
    private String reason;
    private Date begin;
    private Date end;
    private int flag;
    private Employee employee;

    public AskForLeave() {
    }

    public AskForLeave(int id, int type, String reason, Date begin, Date end, int flag, Employee employee) {
        this.id = id;
        this.type = type;
        this.reason = reason;
        this.begin = begin;
        this.end = end;
        this.flag = flag;
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AskForLeave that = (AskForLeave) o;
        return id == that.id &&
                Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employee);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
