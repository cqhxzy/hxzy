package com.hxzy.biz;

import com.hxzy.bean.Department;

import java.util.List;

public interface DepartmentBiz extends CommonBiz<Department> {
    /**
     * 全查
     * @return Department数组
     */
    List<Department> queryAll();
}
