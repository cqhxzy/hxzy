package com.hxzy.dao.impl;

import com.hxzy.bean.Absent;
import com.hxzy.bean.Employee;
import com.hxzy.dao.EmployeeDao;
import com.hxzy.util.DataSourceUtil;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private DataSourceUtil util = DataSourceUtil.getInstance();
    @Override
    public int add(Employee employee) {
        String sql = "insert into employee (name,loginPwd,idCard,phone,position,d_id,salary,donus,p_id,state)" +
                " values (?,?,?,?,?,?,?,?,?,?)";
        Object[] params = {employee.getName(),employee.getLoginPwd(),employee.getIdCard(),employee.getPhone(),employee.getPosition()
        ,employee.getDepartment().getdId(),employee.getSalary(),employee.getBonus(),employee.getLeaders().geteId(),employee.getState()};
        return util.executeUpdate(sql,params);

    }

    @Override
    public int update(Employee employee) {
        String sql = "update employee set name=?,loginPwd=?,idCard=?,phone=?,position=?,d_id=?,salary=?,donus=?,p_id=?,state=? where id=?";
        Object[] params = {employee.getName(),employee.getLoginPwd(),employee.getIdCard(),employee.getPhone(),employee.getPosition()
                ,employee.getDepartment().getdId(),employee.getSalary(),employee.getBonus(),employee.getLeaders().geteId(),employee.getState(),employee.geteId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from employee where id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public Employee queryOne(int id) {
        String sql = "select e.id eId,e.name,e.loginPwd,e.idCard,e.phone,e.position,e.d_id,e.salary,e.p_id,e.donus,e.state from employee e where id=?";
        return util.queryOne(Employee.class,sql,id);
    }

    @Override
    public List<Employee> queryAll() {
        String sql = "select e.id eId,e.name,e.loginPwd,e.idCard,e.phone,e.position,e.d_id,e.salary,e.donus,e.p_id,e.state from employee e";
        List<Employee> employees = util.queryList(Employee.class,sql);
        return employees;
    }

    @Override
    public Employee login(String username, String password) {
        String sql = "select e.id.e.name,e.idCard,e.phone,e.position,e.d_id,e.salary,e.donus,e.p_id from employee e where idCard=? or phone=? and loginPwd=? and state=1";
        Object[] params = {username,username,password};
        return util.queryOne(Employee.class,sql,params);
    }

    @Override
    public Employee updatePwd(String username, String oldPassword, String password) {
        String sql ="update employee e set e.loginPwd=? where e.idCard=? or e.phone=? and e.loginPwd=?";
        Object[] params ={password,username,username,oldPassword};
        return util.queryOne(Employee.class,sql,params);
    }


}
