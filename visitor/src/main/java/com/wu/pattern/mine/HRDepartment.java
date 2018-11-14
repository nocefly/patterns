package com.wu.pattern.mine;

/**
 * @Title: HRDepartment
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/6
 * @Version: V1.0
 */
public class HRDepartment extends Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        if(employee.getWorkTime()<40)
            System.out.println(String.format("%s works %s hours, lack time %s hours",employee.getName(),employee.getWorkTime(),40-employee.getWorkTime()));
        else if(employee.getWorkTime()>40)
            System.out.println(String.format("%s works %s hours, additional time %s hours",employee.getName(),employee.getWorkTime(),employee.getWorkTime()-40));
        else
            System.out.println(String.format("%s works %s hours",employee.getName(),employee.getWorkTime(),employee.getWorkTime()));
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        System.out.println(String.format("%s works %s hours.",employee.getName(),employee.getWorkTime()));
    }
}
