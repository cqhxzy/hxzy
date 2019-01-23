package com.hxzy.dao;

import com.hxzy.bean.absent;

import java.util.List;

public interface absentDao extends CommonDao<absent>{
    /**
     * 全查
     * @return
     */
    List<absent> queryAll();
}
