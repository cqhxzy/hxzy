package com.hxzy.dao.impl;

import com.hxzy.bean.Absent;
import com.hxzy.bean.Employee;
import com.hxzy.dao.EmployeeDao;
import com.hxzy.util.DataSourceUtil;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private DataSourceUtil util = new DataSourceUtil().getInstance();
    @Override
    public int add(Employee employee) {
        String sql = "INSERT INTO employee (`name`,loginPwd,idCard,phone,position,d_id,salary,donus,p_id,state)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?)";
        Object[] params = {employee.getName(),employee.getLoginPwd(),employee.getIdCard(),employee.getPhone(),
                           employee.getPosition(),employee.getDepartment(),employee.getSalary(),
                           employee.getBonus(),employee.getLeaders(),employee.getState()};
        return  util.executeUpdate(sql,params);
    }

    @Override
    public int update(Employee employee) {
        String sql = "UPDATE employee SET  `name`=?,loginPwd=?,idCard=?,phone=?," +
                "position=?,d_id=?,salary=?,donus=?,p_id=?,state=?  WHERE id=?" ;
        Object[] params = {employee.getName(),employee.getLoginPwd(),employee.getIdCard(),employee.getPhone(),
                employee.getPosition(),employee.getDepartment(),employee.getSalary(),
                employee.getBonus(),employee.getLeaders(),employee.getState(),employee.geteId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from employee where id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public Employee queryOne(int id) {
        String sql = " SELECT e.id eid,e.`name` `name`,e.loginPwd pwd,e.idCard," +
                " e.phone,e.position,e.d_id did,e.salary,e.donus,e.p_id pid,e.state" +
                " FROM employee e  where id=?";
        return util.queryOne(Employee.class,sql,id);
    }

    @Override
    public List<Absent> queryAll() {
        String sql = " SELECT e.id eid,e.`name` `name`,e.loginPwd pwd,e.idCard," +
                "e.phone,e.position,e.d_id did,e.salary,e.donus,e.p_id pid,e.state" +
                " FROM employee e";
        List<Absent> Employee = util.queryList(Absent.class, sql);
        return Employee;
    }
}
