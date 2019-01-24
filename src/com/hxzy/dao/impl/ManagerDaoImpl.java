package com.hxzy.dao.impl;

import com.hxzy.bean.AskForLeave;

import java.util.List;

/**
 * 经理的实现类
 */
public class ManagerDaoImpl extends EmployeeDaoImpl implements com.hxzy.dao.ManagerDao {
    @Override
    public List<AskForLeave> getApprovals(int managerId) {
        return null;
    }

    @Override
    public int approval(int askForLeaveId, int access) {
        return 0;
    }
}
