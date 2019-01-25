package com.hxzy.dao.impl;

import com.hxzy.bean.AskForLeave;
import com.hxzy.util.DataSourceUtil;

import java.util.Calendar;
import java.util.List;

/**
 * 经理的实现类
 */
public class ManagerDaoImpl extends EmployeeDaoImpl implements com.hxzy.dao.ManagerDao {
    private DataSourceUtil util = DataSourceUtil.getInstance();
    @Override
    public List<AskForLeave> getApprovals(int managerId) {
        String sql ="SELECT t.name,t.position,a.id,a.type,a.begin,a.end,a.flag,a.reason FROM\n" +
                "askforleave a" +
                "INNER JOIN(" +
                "SELECT * FROM" +
                "employee e" +
                ") t" +
                "on t.id = a.e_id";
        List<AskForLeave> askForLeaves = util.queryList(AskForLeave.class,sql);
        return askForLeaves;
    }

    @Override
    public int approval(int askForLeaveId, int access) {
        String sql = "update askforleave set flag=? where id=?";
        Object[] params={access,askForLeaveId};
        return util.executeUpdate(sql,params);
    }
}
