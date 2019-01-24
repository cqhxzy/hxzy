package com.hxzy.dao.impl;

import com.hxzy.bean.Department;
import com.hxzy.dao.DepartmentDao;
import com.hxzy.util.DataSourceUtil;

import java.util.List;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    private DataSourceUtil util = DataSourceUtil.getInstance();
    @Override
    public int add(Department department) {
        String sql = "insert into department (name) values (?)";
        Object[] params = {department.getName()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int update(Department department) {
        String sql = "update department set name=? where d_id=?";
        Object[] params = {department.getName(),department.getdId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from department where d_id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public Department queryOne(int id) {
        String sql = "select d.name from department d where d.d_id=?";
        return util.queryOne(Department.class,sql,id);
    }

    @Override
    public List<Department> queryAll() {
        String sql = "select d.d_id,d.name from department d";
        List<Department> departments = util.queryList(Department.class,sql);
        return departments;
    }

    @Override
    public List<Department> queryAll() {
        return null;
    }
}
