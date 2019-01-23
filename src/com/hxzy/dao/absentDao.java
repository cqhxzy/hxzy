package com.hxzy.dao;

import com.hxzy.bean.Absent;

import java.util.List;

public interface absentDao extends CommonDao<Absent>{
    /**
     * 全查
     * @return
     */
    List<Absent> queryAll();
}
