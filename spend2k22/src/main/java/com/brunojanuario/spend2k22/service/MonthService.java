package com.brunojanuario.spend2k22.service;

import com.brunojanuario.spend2k22.persistence.dao.MonthRepository;
import com.brunojanuario.spend2k22.persistence.model.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonthService {

    private MonthRepository monthRepository;
    private Month currentMonth;

    public Month getMonth(int id) {
        return monthRepository.findById(id).get();
    }

    public void addEarnings(double amount) {
       currentMonth.setEarnings(currentMonth.getEarnings()+amount);
       currentMonth.setBalance(currentMonth.getBalance()+amount);
       monthRepository.save(currentMonth);
    }

    public void addFood(double amount) {
        currentMonth.setFood(currentMonth.getFood()+amount);
        currentMonth.setBalance(currentMonth.getBalance()-amount);
        monthRepository.save(currentMonth);
    }

    public void addCar(double amount) {
        currentMonth.setCar(currentMonth.getCar()+amount);
        currentMonth.setBalance(currentMonth.getBalance()-amount);
        monthRepository.save(currentMonth);
    }

    public void addBills(double amount) {
        currentMonth.setBills(currentMonth.getBills()+amount);
        currentMonth.setBalance(currentMonth.getBalance()-amount);
        monthRepository.save(currentMonth);
    }

    public void addOthers(double amount) {
        currentMonth.setOthers(currentMonth.getOthers()+amount);
        currentMonth.setBalance(currentMonth.getBalance()-amount);
        monthRepository.save(currentMonth);
    }

    @Autowired
    public MonthService(MonthRepository monthRepository) {
        this.monthRepository = monthRepository;
    }

    public Month getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(Month currentMonth) {
        this.currentMonth = currentMonth;
    }
}
