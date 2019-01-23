package com.hxzy.dao;

import com.hxzy.bean.Absent;

import java.util.List;

/**
 * 旷工人员类/dao
 * @author yu
 */
public interface AbsentDao extends CommonDao<Absent>{
    /**
     * 全查
     * @return
     */
    List<Absent> queryAll();
}
