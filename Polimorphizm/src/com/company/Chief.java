package com.company;

public class Chief extends Worker {
    private int percent;

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        double amountPercent = baseSalary * percent / 100;
        return baseSalary + amountPercent;
    }
    public Chief(String fio) {
        super(fio);
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
