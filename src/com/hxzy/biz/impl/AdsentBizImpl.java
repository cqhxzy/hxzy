package com.hxzy.biz.impl;

import com.hxzy.bean.Absent;
import com.hxzy.biz.AbsentBiz;
import com.hxzy.dao.AbsentDao;
import com.hxzy.dao.impl.AbsentDaoImpl;
import java.util.List;

/**
 * 旷工类 biz.impl
 * 旷工类Biz的实现类
 * @author yu
 */
public class AdsentBizImpl implements AbsentBiz {
    private AbsentDao dao = new AbsentDaoImpl();
    @Override
    public List<Absent> queryAll() {
        return dao.queryAll();
    }

    @Override
    public int add(Absent absent) {
        return dao.add(absent);
    }

    @Override
    public int update(Absent absent) {
        return dao.update(absent);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public Absent queryOne(int id) {
        return dao.queryOne(id);
    }
}
