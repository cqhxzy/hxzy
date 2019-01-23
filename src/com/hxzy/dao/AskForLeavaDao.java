package com.hxzy.dao;

import com.hxzy.bean.AskForLeave;

import java.util.List;


public interface AskForLeavaDao extends CommonDao<AskForLeave> {
    /**
     * 根据员工编号查找请假信息
     * @param eId
     * @return
     */
    AskForLeave queryByEId(int eId);

    /**
     * 全查
     * @return
     */
    List<AskForLeave> queryAll();
}
