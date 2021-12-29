package com.brunojanuario.spend2k22;

import com.brunojanuario.spend2k22.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        HomeController controller = context.getBean(HomeController.class);

        controller.init();

    }
}
