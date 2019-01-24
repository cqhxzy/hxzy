package com.hxzy.dao.impl;

import com.hxzy.bean.Wagesinfo;
import com.hxzy.dao.WagesinfoDao;
import com.hxzy.util.DataSourceUtil;

import java.util.List;

/**
 * 工资发放类  dao.biz
 * 工资发放类dao的实现类
 * @author yu
 */
public class WagesinfoDaoImpl implements WagesinfoDao {
    private DataSourceUtil util = new DataSourceUtil().getInstance();
    @Override
    public List<Wagesinfo> queryAll() {
        String sql ="SELECT w.id,w.e_id wEid,w.time,w.wages,w.deduct" +
                "  FROM wagesinfo w";
        List<Wagesinfo> list = util.queryList(Wagesinfo.class,sql);
        return list;
    }

    @Override
    public int add(Wagesinfo wagesinfo) {
        String sql = "INSERT INTO wagesinfo (e_id,time,wages,deduct) VALUES (?,?,?,?)";
        Object[] params = {wagesinfo.getE_id(),wagesinfo.getTime(),wagesinfo.getWages(),wagesinfo.getDeduct()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int update(Wagesinfo wagesinfo) {
        String sql = "UPDATE wagesinfo SET e_id=?,time=?,wages=?,deduct=? WHERE id=?";
        Object[] params = {wagesinfo.getE_id(),wagesinfo.getTime(),wagesinfo.getWages(),
                wagesinfo.getDeduct(),wagesinfo.getId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from wagesinfo where id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public Wagesinfo queryOne(int id) {
        String sql ="SELECT w.id,w.e_id wEid,w.time,w.wages,w.deduct" +
                "  FROM wagesinfo w  where id=?";
        return util.queryOne(Wagesinfo.class,sql,id);
    }
}
