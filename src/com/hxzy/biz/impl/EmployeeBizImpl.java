package com.hxzy.biz.impl;

import com.hxzy.bean.Attendance;
import com.hxzy.bean.Employee;
import com.hxzy.biz.EmployeeBiz;
import com.hxzy.dao.EmployeeDao;
import com.hxzy.dao.impl.EmployeeDaoImpl;

import java.util.Date;
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

    @Override
    public Employee updatePwd(String username, String oldPassword, String password) {
        return dao.updatePwd(username,oldPassword,password);
    }

    @Override
    public List<Attendance> clocked(int id) {
        return dao.clocked(id);
    }

    @Override
    public int clock(int id) {
        return dao.clock(id);
    }

    @Override
    public int askForLeave(int id, int type, int reason, Date begin, Date end) {
        return askForLeave(id,type,reason,begin,end);
    }
}