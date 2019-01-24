package com.hxzy.biz;

import com.hxzy.bean.Employee;

import java.util.List;

public interface EmployeeBiz extends CommonBiz<Employee> {
    /**
     * 全查
     */
    List<Employee> queryAll();

    Employee login(String username,String password);

    Employee updatePwd(String username,String oldPassword,String password);
}
