package com.hxzy.biz;

import com.hxzy.bean.Attendance;
import com.hxzy.biz.CommonBiz;

import java.util.List;

/**
 * 考勤明细类   biz
 * @author yu
 */
public interface AttendanceBiz extends CommonBiz<Attendance> {
    /**
     * 全查
     * @return
     */
    List<Attendance> queryAll();


}
