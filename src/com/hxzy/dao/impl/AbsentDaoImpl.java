package com.hxzy.dao.impl;

import com.hxzy.bean.Absent;
import com.hxzy.dao.AbsentDao;
import com.hxzy.dao.CommonDao;

import java.util.List;

/**
 * 旷工类    dao.impl
 * 旷工类dao的实现类
 * @author yu
 */
public class AbsentDaoImpl implements AbsentDao {
    private CommonDao dao = new AbsentDaoImpl();
    @Override
    public List<Absent> queryAll() {
        return null;
    }

    @Override
    public int add(Absent absent) {
        return 0;
    }

    @Override
    public int update(Absent absent) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public Absent queryOne(int id) {
        return null;
    }
}
