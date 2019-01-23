package com.hxzy.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * 员工类
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -4931981890299906943L;
    private int eId;
    private String name;
    private String loginPwd;
    private String idCard;
    private String phone;
    private int position;
    private Department department;
    private Double salary;
    private Double bonus;
    private Employee leaders;
    private int state;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eId == employee.eId &&
                Objects.equals(department, employee.department) &&
                Objects.equals(leaders, employee.leaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, department, leaders);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Employee getLeaders() {
        return leaders;
    }

    public void setLeaders(Employee leaders) {
        this.leaders = leaders;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Employee() {
    }

    public Employee(int eId, String name, String loginPwd, String idCard, String phone, int position, Department department, Double salary, Double bonus, Employee leaders, int state) {
        this.eId = eId;
        this.name = name;
        this.loginPwd = loginPwd;
        this.idCard = idCard;
        this.phone = phone;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.bonus = bonus;
        this.leaders = leaders;
        this.state = state;
    }
}
