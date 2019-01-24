package com.hxzy.dao;

import com.hxzy.bean.Attendance;

import java.util.List;

/**
 * 考勤明细表类/dao
 * @author yu
 */
public interface AttendanceDao extends CommonDao<Attendance> {
    /**
     * 全查
     * @return
     */
    List<Attendance> queryAll();

    /**
     * 打卡
     * @param id 员工编号
     * @return
     */
    List<Attendance> clock(int id);
}
