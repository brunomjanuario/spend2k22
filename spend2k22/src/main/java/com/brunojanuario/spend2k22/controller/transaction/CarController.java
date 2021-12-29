package com.brunojanuario.spend2k22.controller.transaction;

import org.springframework.stereotype.Controller;

@Controller
public class CarController extends AbstractTransactionController {

    @Override
    public void init() {
        double amount = super.transactionView.show();
        super.monthService.addCar(amount);
    }
}
