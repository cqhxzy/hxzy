package com.hxzy.dao.impl;

import com.hxzy.bean.Absent;
import com.hxzy.dao.AbsentDao;
import com.hxzy.util.DataSourceUtil;

import java.util.List;

/**
 * 旷工类    dao.impl
 * 旷工类dao的实现类
 * @author yu
 */
public class AbsentDaoImpl implements AbsentDao {
    private DataSourceUtil util = new DataSourceUtil().getInstance();
    @Override
    public List<Absent> queryAll() {
        String sql = "SELECT a.id aid,a.`begin`,a.`end`,a.e_id aEid" +
                "  FROM absent a";
        List<Absent> list=util.queryList(Absent.class,sql);
        return list;
    }

    @Override
    public int add(Absent absent) {
        String sql = "a.`begin`,a.`end`,a.e_id aEid" +
                "  FROM absent a";
        Object[] params = {absent.getBegin(),absent.getEnd(),absent.getE_id()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int update(Absent absent) {
        String sql = "UPDATE absent `begin`=?,`end`=?,e_id=?" +
                "  WHERE id=?";
        Object[] params = {absent.getBegin(),absent.getEnd(),absent.getE_id(),absent.getId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from absent where id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public Absent queryOne(int id) {
        String sql = "SELECT a.id aid,a.`begin`,a.`end`,a.e_id aEid" +
                "  FROM absent a  where id=?";
        return util.queryOne(Absent.class,sql,id);
    }
}
