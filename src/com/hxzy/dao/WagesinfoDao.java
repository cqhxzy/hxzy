package com.hxzy.dao;

import com.hxzy.bean.Wagesinfo;

import java.util.List;

/**
 * 工资发放类/dao
 * @author yu
 */
public interface WagesinfoDao extends CommonDao<Wagesinfo> {
    /**
     * 全查
     * @return
     */
    List<Wagesinfo> queryAll();
}
