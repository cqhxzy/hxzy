package com.hxzy.biz;

import com.hxzy.bean.Wagesinfo;

import java.util.List;

/**
 * 工资发放类，biz
 * @author yu
 */
public interface WagesinfoBiz extends CommonBiz<Wagesinfo> {
    /**
     * 全查
     * @return
     */
    List<Wagesinfo> queryAll();
}
