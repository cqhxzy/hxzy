package com.hxzy.dao;

import com.hxzy.bean.Absent;
import com.hxzy.bean.Attendance;
import com.hxzy.bean.Employee;

import java.util.Date;
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

    /**
     * 员工打卡
     * @param id
     * @return
     */
    int clock(int id);

    /**
     * 根据员工打卡查询打卡明细
     * @param id
     * @return
     */
    List<Attendance> clocked(int id);

    /**
     * 请假
     * @param id
     * @return
     */
    int askForLeave(int id,int type, int reason, Date begin, Date end);

}
