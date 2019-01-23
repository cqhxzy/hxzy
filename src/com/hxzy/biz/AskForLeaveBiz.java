package com.hxzy.biz;

import com.hxzy.bean.AskForLeave;



public interface AskForLeaveBiz extends CommonBiz<AskForLeave> {
    /**
     * 根据员工ID查找请假内容
     * @param eId
     * @return
     */
    AskForLeave queryByEId(int eId);
}
