package com.brunojanuario.spend2k22.view;

import com.brunojanuario.spend2k22.service.MonthService;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Overall view with all the details of the month
 */
@Component
public class MonthView implements View, KeyboardHandler {

    private Keyboard keyboard;
    private int action = -1;
    private MonthService monthService;

    @Override
    public double show() {
        action = -1;
        draw();

        while (action == -1) {

            if (keyboard == null) {
                setKeyboard();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        hide();

        return action;
    }

    private void draw() {
        key1 = new Picture(30,22, "images/key_1.png");
        key1.draw();
        key2 = new Picture(30,114, "images/key_2.png");
        key2.draw();
        key3 = new Picture(30,206, "images/key_3.png");
        key3.draw();
        key4 = new Picture(30,298, "images/key_4.png");
        key4.draw();
        key5 = new Picture(30,390, "images/key_5.png");
        key5.draw();

        picture1 = new Picture(120,22, "images/bills.png");
        picture2 = new Picture(120,114, "images/car.png");
        picture3 = new Picture(120,206, "images/earnings.png");
        picture4 = new Picture(120,298, "images/food.png");
        picture5 = new Picture(120,390, "images/others.png");
        picture6 = new Picture(502,22, "images/board.png");
        picture1.draw();
        picture2.draw();
        picture3.draw();
        picture4.draw();
        picture5.draw();
        picture6.draw();

        text1 = new Text(522, 70, (monthService.getCurrentMonth().getName().toUpperCase()));
        text1.setColor(Color.WHITE);
        text1.draw();
        text2 = new Text(522, 130, ("BALANCE:  " + monthService.getCurrentMonth().getBalance() + " €"));
        text2.setColor(Color.WHITE);
        text2.draw();
        text3 = new Text(522, 190, ("EARNINGS:  " + monthService.getCurrentMonth().getEarnings() + " €"));
        text3.setColor(Color.WHITE);
        text3.draw();
        text4 = new Text(522, 250, ("BILLS:  -" + monthService.getCurrentMonth().getBills() + " €"));
        text4.setColor(Color.WHITE);
        text4.draw();
        text5 = new Text(522, 310, ("CAR:  -" + monthService.getCurrentMonth().getCar() + " €"));
        text5.setColor(Color.WHITE);
        text5.draw();
        text6 = new Text(522, 370, ("FOOD:  -" + monthService.getCurrentMonth().getFood() + " €"));
        text6.setColor(Color.WHITE);
        text6.draw();
        text7 = new Text(522, 430, ("OTHERS:  -" + monthService.getCurrentMonth().getOthers() + " €"));
        text7.setColor(Color.WHITE);
        text7.draw();
    }

    private void hide() {
        key1.delete();
        key2.delete();
        key3.delete();
        key4.delete();
        key5.delete();

        picture1.delete();
        picture2.delete();
        picture3.delete();
        picture4.delete();
        picture5.delete();
        picture6.delete();

        text1.delete();
        text2.delete();
        text3.delete();
        text4.delete();
        text5.delete();
        text6.delete();
        text7.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_1:
                action = 1;
                break;
            case KeyboardEvent.KEY_2:
                action = 2;
                break;
            case KeyboardEvent.KEY_3:
                action = 3;
                break;
            case KeyboardEvent.KEY_4:
                action = 4;
                break;
            case KeyboardEvent.KEY_5:
                action = 5;
                break;
            case KeyboardEvent.KEY_Q:
                System.exit(0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private void setKeyboard() {
        keyboard = new Keyboard(this);

        setKeyPressed(KeyboardEvent.KEY_1);
        setKeyPressed(KeyboardEvent.KEY_2);
        setKeyPressed(KeyboardEvent.KEY_3);
        setKeyPressed(KeyboardEvent.KEY_4);
        setKeyPressed(KeyboardEvent.KEY_5);
        setKeyPressed(KeyboardEvent.KEY_Q);
    }

    private void setKeyPressed(int key) {
        KeyboardEvent Press = new KeyboardEvent();
        Press.setKey(key);
        Press.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(Press);
    }

    // SHAPES

    private Picture key1;
    private Picture key2;
    private Picture key3;
    private Picture key4;
    private Picture key5;

    private Picture picture1;
    private Picture picture2;
    private Picture picture3;
    private Picture picture4;
    private Picture picture5;
    private Picture picture6;

    private Text text1;
    private Text text2;
    private Text text3;
    private Text text4;
    private Text text5;
    private Text text6;
    private Text text7;

    @Autowired
    public void setMonthService(MonthService monthService) {
        this.monthService = monthService;
    }
}
