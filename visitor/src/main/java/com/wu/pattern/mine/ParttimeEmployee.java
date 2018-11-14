package com.wu.pattern.mine;

/**
 * @Title: ParttimeEmployee
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/6
 * @Version: V1.0
 */
public class ParttimeEmployee extends Employee{
    private String name;
    private double hourWage;
    private int workTime;

    public ParttimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}
