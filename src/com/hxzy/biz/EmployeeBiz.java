package com.hxzy.biz;

import com.hxzy.bean.Attendance;
import com.hxzy.bean.Employee;

import java.util.Date;
import java.util.List;

public interface EmployeeBiz extends CommonBiz<Employee> {
    /**
     * 全查
     */
    List<Employee> queryAll();

    Employee login(String username,String password);

    Employee updatePwd(String username,String oldPassword,String password);

    List<Attendance> clocked(int id);

    /**
     * 根据员工编号打卡
     * @param id
     * @return
     */
    int clock(int id);

    int askForLeave(int id, int type, int reason, Date begin, Date end);
}
