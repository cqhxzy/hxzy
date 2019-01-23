package com.hxzy.dao;

import com.hxzy.bean.AskForLeave;

import java.util.List;

public interface AskForLeavaDao extends CommonDao<AskForLeave> {
    /**
     * 全查
     */
    List<AskForLeave> queryAll();
}
