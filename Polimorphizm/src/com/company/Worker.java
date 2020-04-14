package com.company;

public class Worker extends Person {
    private int rate;
    private int hours;

    public Worker(String fio) {
        super(fio);
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public double getSalary() {
        return rate * hours;
    }
}
