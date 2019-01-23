package com.hxzy.dao;

import com.hxzy.bean.attendance;

import java.util.List;

public interface attendanceDao extends CommonDao<attendance> {
    /**
     * 全查
     * @return
     */
    List<attendance> queryAll();
}
