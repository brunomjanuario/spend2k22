package com.brunojanuario.spend2k22.persistence.model;

import javax.persistence.*;

@Entity
@Table
public class Month {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double balance;
    private double earnings;
    private double food;
    private double car;
    private double bills;
    private double others;

    public Month() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getCar() {
        return car;
    }

    public void setCar(double car) {
        this.car = car;
    }

    public double getBills() {
        return bills;
    }

    public void setBills(double bills) {
        this.bills = bills;
    }

    public double getOthers() {
        return others;
    }

    public void setOthers(double others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Months{" +
                "id=" + id +
                ", name=" + name +
                ", balance=" + balance +
                ", earnings=" + earnings +
                ", food=" + food +
                ", car=" + car +
                ", bills=" + bills +
                ", others=" + others +
                '}';
    }
}
