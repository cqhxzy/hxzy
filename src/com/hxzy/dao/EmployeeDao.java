package com.hxzy.dao;

import com.hxzy.bean.Absent;
import com.hxzy.bean.Employee;

import java.util.List;

public interface EmployeeDao extends CommonDao<Employee>{
    /**
     * 全查
     * @return employee数组
     */
    List<Employee> queryAll();

    /**
     * 用户登录
     * @param username 身份证号，电话号
     * @param password 登陆密码loginPwd
     * @return 一个Employee对象
     */
    Employee login(String username,String password);

    /**
     * 修改密码
     * @return
     */
    Employee updatePwd(String username,String oldPassword,String password);
}
