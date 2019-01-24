package com.hxzy.dao;
import com.hxzy.bean.Department;

import java.util.List;

public interface DepartmentDao extends CommonDao<Department>{
    /**
     * 全查
     */
    List<Department> queryAll();
}
