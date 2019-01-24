package com.hxzy.biz;

import com.hxzy.bean.AskForLeave;

import java.util.List;


public interface AskForLeaveBiz extends CommonBiz<AskForLeave> {
    /**
     * 根据员工ID查找请假内容
     * @param eId 员工编号
     * @return 一个不完全的AskForLeave对象
     */
    AskForLeave queryByEId(int eId);

    /**
     * 全查
     * @return AskForLeave数组
     */
    List<AskForLeave> queryAll();
}
