package com.hxzy.dao.impl;

import com.hxzy.bean.Attendance;
import com.hxzy.dao.AttendanceDao;
import com.hxzy.dao.CommonDao;

import java.util.List;

/**
 * 考勤明细类   dao.impl
 * 考勤明细类dao的实现类
 * @author yu
 */
public class AttendanceDaoImpl implements AttendanceDao {
    private CommonDao dao = new AbsentDaoImpl();
    @Override
    public List<Attendance> queryAll() {
        return null;
    }

    @Override
    public int add(Attendance attendance) {
        return 0;
    }

    @Override
    public int update(Attendance attendance) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public Attendance queryOne(int id) {
        return null;
    }
}
