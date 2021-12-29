package com.brunojanuario.spend2k22.controller;

import com.brunojanuario.spend2k22.service.MonthService;
import com.brunojanuario.spend2k22.view.HomeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController implements com.brunojanuario.spend2k22.controller.Controller {

    private MonthService monthService;
    private HomeView view;
    private MonthController monthController;


    @Override
    public void nextController() {
        monthController.init();
    }

    @Override
    public void init() {
        int monthId = (int) view.show();
        monthService.setCurrentMonth(monthService.getMonth(monthId));

        nextController();
    }


    @Autowired
    public void setMonthService(MonthService monthService) {
        this.monthService = monthService;
    }

    @Autowired
    public void setView(HomeView view) {
        this.view = view;
    }

    @Autowired
    public void setMonthController(MonthController monthController) {
        this.monthController = monthController;
    }
}
