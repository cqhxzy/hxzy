package com.hxzy.biz.impl;

import com.hxzy.bean.Attendance;
import com.hxzy.biz.AttendanceBiz;
import com.hxzy.dao.AttendanceDao;
import com.hxzy.dao.impl.AttendanceDaoImpl;
import java.util.List;

/**
 * 考勤明细类 biz.impl
 * 考勤明细类biz的实现类
 * @author yu
 */
public class AttendanceBizImpl implements AttendanceBiz {
    private AttendanceDao dao = new AttendanceDaoImpl();
    @Override
    public List<Attendance> queryAll() {
        return dao.queryAll();
    }

    @Override
    public List<Attendance> clock(int id) {
        return dao.clock(id);
    }

    @Override
    public int add(Attendance attendance) {
        return dao.add(attendance);
    }

    @Override
    public int update(Attendance attendance) {
        return dao.update(attendance);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public Attendance queryOne(int id) {
        return dao.queryOne(id);
    }
}
