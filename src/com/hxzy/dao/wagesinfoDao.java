package com.hxzy.dao;

import com.hxzy.bean.Wagesinfo;

import java.util.List;

public interface wagesinfoDao extends CommonDao<Wagesinfo> {
    /**
     * 全查
     * @return
     */
    List<Wagesinfo> queryAll();
}
