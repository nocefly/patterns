package com.wu.pattern.mine;

/**
 * @Title: HRDepartment
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/6
 * @Version: V1.0
 */
public class FADepartment extends Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        if(employee.getWorkTime()<40)
            System.out.println(String.format("%s receives %s salary, minus %s salary",employee.getName(),employee.getWeeklyWage(),(40-employee.getWorkTime())*80));
        else if(employee.getWorkTime()>40)
            System.out.println(String.format("%s receives %s salary, extra %s salary",employee.getName(),employee.getWeeklyWage(),(employee.getWorkTime()-40)*100));
        else
            System.out.println(String.format("%s receives %s salary",employee.getName(),employee.getWeeklyWage()));
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        System.out.println(String.format("%s receives %s salary.",employee.getName(),employee.getWorkTime()*employee.getHourWage()));
    }
}
