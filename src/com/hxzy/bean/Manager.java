package com.hxzy.bean;

/**
 * 经理
 * 经理也是员工
 */
public class Manager extends Employee {
    public Manager() {
        super.setPosition("经理");
    }
}
