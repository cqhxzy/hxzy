package com.hxzy.dao;

import com.hxzy.bean.wagesinfo;
import java.util.List;

public interface wagesinfoDao extends CommonDao<wagesinfo> {
    /**
     * 全查
     * @return
     */
    List<wagesinfo> queryAll();
}
