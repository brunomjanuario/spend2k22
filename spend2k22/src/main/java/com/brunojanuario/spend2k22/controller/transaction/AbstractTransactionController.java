package com.brunojanuario.spend2k22.controller.transaction;

import com.brunojanuario.spend2k22.controller.MonthController;
import com.brunojanuario.spend2k22.service.MonthService;
import com.brunojanuario.spend2k22.view.TransactionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public abstract class AbstractTransactionController implements TransactionController{

    protected TransactionView transactionView;
    protected MonthService monthService;

    @Autowired
    public void setTransactionView(TransactionView transactionView) {
        this.transactionView = transactionView;
    }

    @Autowired
    public void setMonthService(MonthService monthService) {
        this.monthService = monthService;
    }

}
