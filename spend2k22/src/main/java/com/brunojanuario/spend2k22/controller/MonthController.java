package com.brunojanuario.spend2k22.controller;
import com.brunojanuario.spend2k22.controller.transaction.*;
import com.brunojanuario.spend2k22.view.MonthView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MonthController implements com.brunojanuario.spend2k22.controller.Controller {
    private MonthView monthView;
    private int controllerID;
    private BillsController billsController;
    private CarController carController;
    private EarningsController earningsController;
    private FoodController foodController;
    private OthersController othersController;

    @Override
    public void nextController() {
        switch (controllerID) {
            case 1:
                billsController.init();
                break;
            case 2:
                carController.init();
                break;
            case 3:
                earningsController.init();
                break;
            case 4:
                foodController.init();
                break;
            case 5:
                othersController.init();
                break;
        }

        init();

    }

    @Override
    public void init() {
        controllerID = (int) monthView.show();
        nextController();
    }

    @Autowired
    public void setMonthView(MonthView monthView) {
        this.monthView = monthView;
    }

    @Autowired
    public void setBillsController(BillsController billsController) {
        this.billsController = billsController;
    }

    @Autowired
    public void setCarController(CarController carController) {
        this.carController = carController;
    }

    @Autowired
    public void setEarningsController(EarningsController earningsController) {
        this.earningsController = earningsController;
    }

    @Autowired
    public void setFoodController(FoodController foodController) {
        this.foodController = foodController;
    }

    @Autowired
    public void setOthersController(OthersController othersController) {
        this.othersController = othersController;
    }
}
