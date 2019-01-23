package com.hxzy.biz.impl;

import com.hxzy.bean.Wagesinfo;
import com.hxzy.biz.WagesinfoBiz;
import com.hxzy.dao.WagesinfoDao;
import com.hxzy.dao.impl.WagesinfoDaoImpl;
import java.util.List;

/**
 * 工资发放类 biz.impl
 * 工资发放类Biz的实现类
 * @author yu
 */
public class WagesinfoBizImpl implements WagesinfoBiz {
    private WagesinfoDao dao = new WagesinfoDaoImpl();
    @Override
    public List<Wagesinfo> queryAll() {
        return dao.queryAll();
    }

    @Override
    public int add(Wagesinfo wagesinfo) {
        return dao.add(wagesinfo);
    }

    @Override
    public int update(Wagesinfo wagesinfo) {
        return dao.update(wagesinfo);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public Wagesinfo queryOne(int id) {
        return dao.queryOne(id);
    }
}
