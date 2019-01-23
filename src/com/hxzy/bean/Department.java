package com.hxzy.bean;

import java.util.Objects;

/**
 * 部门类
 */
public class Department {
    private int dId;
    private String name;

    public Department(int dId, String name) {
        this.dId = dId;
        this.name = name;
    }

    public Department() {
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return dId == that.dId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dId);
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", name='" + name + '\'' +
                '}';
    }
}
