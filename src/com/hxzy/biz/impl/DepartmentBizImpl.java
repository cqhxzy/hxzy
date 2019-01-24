package com.hxzy.biz.impl;

import com.hxzy.bean.Department;
import com.hxzy.biz.DepartmentBiz;
import com.hxzy.dao.DepartmentDao;
import com.hxzy.dao.impl.DepartmentDaoImpl;

import java.util.List;

public class DepartmentBizImpl implements DepartmentBiz {
    private DepartmentDao dao = new DepartmentDaoImpl();
    @Override
    public int add(Department department) {
        return dao.add(department);
    }

    @Override
    public int update(Department department) {
        return dao.update(department);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public Department queryOne(int id) {
        return dao.queryOne(id);
    }

    @Override
    public List<Department> queryAll() {
        return dao.queryAll();
    }
}
