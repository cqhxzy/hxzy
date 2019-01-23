package com.hxzy.dao;

import com.hxzy.bean.Attendance;

import java.util.List;

public interface attendanceDao extends CommonDao<Attendance> {
    /**
     * 全查
     * @return
     */
    List<Attendance> queryAll();
}
