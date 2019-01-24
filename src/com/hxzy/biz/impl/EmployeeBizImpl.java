package com.hxzy.biz.impl;

import com.hxzy.bean.Employee;
import com.hxzy.biz.EmployeeBiz;
import com.hxzy.dao.EmployeeDao;
import com.hxzy.dao.impl.EmployeeDaoImpl;

import java.util.List;

public class EmployeeBizImpl implements EmployeeBiz {
    private EmployeeDao dao = new EmployeeDaoImpl();
    @Override
    public int add(Employee employee) {
        return dao.add(employee);
    }

    @Override
    public int update(Employee employee) {
        return dao.update(employee);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public Employee queryOne(int id) {
        return dao.queryOne(id);
    }

    @Override
    public List<Employee> queryAll() {
        return dao.queryAll();
    }

    @Override
    public Employee login(String username, String password) {
        return dao.login(username,password);
    }
}