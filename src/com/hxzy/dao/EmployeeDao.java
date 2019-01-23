package com.hxzy.dao;

import com.hxzy.bean.Absent;
import com.hxzy.bean.Employee;

import java.util.List;

public interface EmployeeDao extends CommonDao<Employee>{
    /**
     * 全查
     * @return
     */
    List<Absent> queryAll();
}
