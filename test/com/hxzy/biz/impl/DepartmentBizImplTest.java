package com.hxzy.biz.impl;

import com.hxzy.bean.Department;
import com.hxzy.biz.DepartmentBiz;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * DepartmentBizImpl的测试类
 */
public class DepartmentBizImplTest {
    private DepartmentBiz biz = new DepartmentBizImpl();

    /*
    * 通过测试的方法会有绿色的√
    * 在eclipse中通过测试的方法会显示绿色的进度条
    *
    * @Before注解的方法会在被测试的方法（加了@Test）执行前被执行一次
    * @After注解的方法会在被测试的方法执行后被执行一次
    * @Ignore 忽略执行的方法
    *
    * 测试方法通常是test+方法名组成
    * 测试方法的返回值类型必须是void
    * */

    @Before
    public void setUp() throws Exception {
        System.out.println("执行Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("执行After");
    }

    /*凡是加了Test注解的方法都会在运行时执行*/
    @Test
    public void add() {
        System.out.println("执行add方法的测试");
        int num = (int)(Math.random() * 3);
        /*
        assertEquals方法会根据我们输入两个参数（期望值和实际值）
        进行比较，如果相同，则测试通过，如果不相同，则测试失败
        * assertEquals(期望值,实际值)
        *
        assertNotEquals(); 如果不匹配则通过测试，否则不通过测试
        assertNull(@NullAble String msg,object);  如果object为null，则通过，否则不通过
        assertNotNull(@NullAble String msg,object) 如果object不为null，通过，否则不通过
        assertArrayEquals(); 判断两个数组是否相同
        * */
        System.out.println("期望值：1，实际值：" + num);
        //Assert.assertEquals("实际值与期望值不匹配",1,num);
    }

    @Test
    public void update() {
        System.out.println("执行update方法的测试");
    }

    @Test
    public void remove() {
        System.out.println("执行remove方法的测试");
    }

    @Test
    public void queryOne() {
        //System.out.println("执行queryOne方法的测试");
        Department department = biz.queryOne(1);
        System.out.println(department);
        assertNotNull("部门对象为空",department);
    }
}