package com.hxzy.biz;

import com.hxzy.bean.Absent;

import java.util.List;

/**
 * 旷工类，biz
 * @author yu
 */
public interface AbsentBiz extends CommonBiz<Absent> {
    /**
     * 全查
     * @return
     */
    List<Absent> queryAll();
}
