package com.hxzy.dao;

import com.hxzy.bean.AskForLeave;

import java.util.List;

public interface ManagerDao extends EmployeeDao {
    /**
     * 经理能够根据自己的编号查找自己所属员工的
     * 未审批请假的信息
     * @param managerId
     */
    List<AskForLeave> getApprovals(int managerId);

    /**
     * 根据请假编号修改审批结果
     * @param askForLeaveId  请假的编号
     * @param access 审批结果，1：通过   2.未通过
     * @return
     */
    int approval(int askForLeaveId,int access);
}
