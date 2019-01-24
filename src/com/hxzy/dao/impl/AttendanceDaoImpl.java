package com.hxzy.dao.impl;

import com.hxzy.bean.Attendance;
import com.hxzy.dao.AttendanceDao;
import com.hxzy.util.DataSourceUtil;

import java.sql.SQLPermission;
import java.util.List;

/**
 * 考勤明细类   dao.impl
 * 考勤明细类dao的实现类
 * @author yu
 */
public class AttendanceDaoImpl implements AttendanceDao {
    private DataSourceUtil util = new DataSourceUtil().getInstance();
    @Override
    public List<Attendance> queryAll() {
        String sql = "SELECT a.id,a.e_id,a.`start`,a.`leave`" +
                "FROM attendance a";
        List<Attendance> list = util.queryList(Attendance.class,sql);
        return list;
    }

    @Override
    public List<Attendance> clock(int id) {
        String sql = "SELECT t.name,a.time,a.type,a.id FROM attendance a" +
                "INNER JOIN(" +
                "select e.name,e.id FROM employee e where e.id=?)t" +
                "on t.id = a.e_id";
        Object[] params = {id};
        return util.queryList(Attendance.class,sql,params);
    }

    @Override
    public int add(Attendance attendance) {
        String sql = "INSERT INTO attendance (e_id,`start`,`type`) VALUES (?,?,?)";
        Object[] params = {attendance.getE_id(),attendance.getStart(),attendance.getType()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int update(Attendance attendance) {
        String sql = "UPDATE attendance SET e_id=?,`start`=?,`leave`=?   WHERE id=?";
        Object[] params = {attendance.getE_id(),attendance.getStart(),attendance.getType(),attendance.getId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from attendance where id=?;";
        return util.executeUpdate(sql,id);
    }

    @Override
    public Attendance queryOne(int id) {
        String sql = "SELECT a.id,a.e_id,a.`start`,a.`leave`" +
                "  FROM attendance a" +
                "  WHERE id=?";
        return util.queryOne(Attendance.class,sql,id);
    }
}
