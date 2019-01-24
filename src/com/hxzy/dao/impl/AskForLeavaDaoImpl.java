package com.hxzy.dao.impl;

import com.hxzy.bean.AskForLeave;
import com.hxzy.dao.AskForLeavaDao;
import com.hxzy.util.DataSourceUtil;

import java.util.List;


public class AskForLeavaDaoImpl implements AskForLeavaDao {
    private DataSourceUtil util = DataSourceUtil.getInstance();
    @Override
    public int add(AskForLeave askForLeave) {
        String sql = "insert into askforleave (type,reason,begin,end,flag,e_id) values (?,?,?,?,?,?)";
        Object[] params = {askForLeave.getType(),askForLeave.getReason(),askForLeave.getBegin(),askForLeave.getEnd()
                ,askForLeave.getFlag(),askForLeave.getEmployee().geteId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int update(AskForLeave askForLeave) {
        String sql = "update askforleave set type=?,reason=?,begin=?,end=?,flag=?,e_id=? where id=?";
        Object[] params = {askForLeave.getType(),askForLeave.getReason(),askForLeave.getBegin(),askForLeave.getEnd()
                ,askForLeave.getFlag(),askForLeave.getEmployee().geteId(),askForLeave.getId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete form askforleave where id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public AskForLeave queryOne(int id) {
        String sql = "select a.id,a.type,a.reason,a.begin,a.end,a.flag,a.e_id from askforleave a where a.id=?";
        return util.queryOne(AskForLeave.class,sql,id);
    }

    @Override
    public AskForLeave queryByEId(int eId) {
        String sql = "select a.e_id eId,a.id,a.type,a.reason,a.begin,a.end,a.flag from askforleave a where a.e_id=?";
        return util.queryOne(AskForLeave.class,sql,eId);
    }

    @Override
    public List<AskForLeave> queryAll() {
        String sql = "select a.id,a.type,a.reason,a.begin,a.end,a.flag,a.e_id from askforleave a";
        List<AskForLeave> askForLeaves = util.queryList(AskForLeave.class,sql);
        return askForLeaves;
    }


}
