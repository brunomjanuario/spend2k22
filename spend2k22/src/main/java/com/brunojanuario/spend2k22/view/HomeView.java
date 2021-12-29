package com.brunojanuario.spend2k22.view;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.springframework.stereotype.Component;

@Component
public class HomeView implements View, KeyboardHandler {

    private Keyboard keyboard;
    private int month=-1;
    private boolean toggle = false;

    @Override
    public double show() {

        while (month == -1) {
            if(keyboard == null) {
                draw();
                setKeyboard();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        hide();

        return month;
    }

    private void draw() {
        Picture background = new Picture(10,10,"images/background.jpg");
        background.draw();

        key1 = new Picture(30,70, "images/key_1.png");
        key1.draw();
        key2 = new Picture(30,210, "images/key_2.png");
        key2.draw();
        key3 = new Picture(30,350, "images/key_3.png");
        key3.draw();
        key4 = new Picture(762,70, "images/key_4.png");
        key4.draw();
        key5 = new Picture(762,210, "images/key_5.png");
        key5.draw();
        key6 = new Picture(762,350, "images/key_6.png");
        key6.draw();
        keyDown = new Picture(396,390, "images/key_down.png");
        keyDown.draw();

        picture1 = new Picture(120,70, "images/1.png");
        picture1.draw();
        picture2 = new Picture(120,210, "images/2.png");
        picture2.draw();
        picture3 = new Picture(120,350, "images/3.png");
        picture3.draw();
        picture4 = new Picture(502,70, "images/4.png");
        picture4.draw();
        picture5 = new Picture(502,210, "images/5.png");
        picture5.draw();
        picture6 = new Picture(502,350, "images/6.png");
        picture6.draw();

        picture7 = new Picture(120,70, "images/7.png");
        picture8 = new Picture(120,210, "images/8.png");
        picture9 = new Picture(120,350, "images/9.png");
        picture10 = new Picture(502,70, "images/10.png");
        picture11 = new Picture(502,210, "images/11.png");
        picture12 = new Picture(502,350, "images/12.png");
    }

    private void hide() {
        key1.delete();
        key2.delete();
        key3.delete();
        key4.delete();
        key5.delete();
        key6.delete();
        keyDown.delete();

        picture1.delete();
        picture2.delete();
        picture3.delete();
        picture4.delete();
        picture5.delete();
        picture6.delete();
        picture7.delete();
        picture8.delete();
        picture9.delete();
        picture10.delete();
        picture11.delete();
        picture12.delete();

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_1:
                month = 1;
                if(toggle) {
                    month += 6;
                }
                break;
            case KeyboardEvent.KEY_2:
                month = 2;
                if(toggle) {
                    month += 6;
                }
                break;
            case KeyboardEvent.KEY_3:
                month = 3;
                if(toggle) {
                    month += 6;
                }
                break;
            case KeyboardEvent.KEY_4:
                month = 4;
                if(toggle) {
                    month += 6;
                }
                break;
            case KeyboardEvent.KEY_5:
                month = 5;
                if(toggle) {
                    month += 6;
                }
                break;
            case KeyboardEvent.KEY_6:
                month = 6;
                if(toggle) {
                    month += 6;
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                if (toggle) {
                    toggle = false;
                } else {
                    toggle = true;
                }
                changeMonths();
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
        setKeyPressed(KeyboardEvent.KEY_6);
        setKeyPressed(KeyboardEvent.KEY_DOWN);
        setKeyPressed(KeyboardEvent.KEY_Q);
    }

    private void setKeyPressed(int key) {
        KeyboardEvent Press = new KeyboardEvent();
        Press.setKey(key);
        Press.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(Press);
    }

    private void changeMonths() {
        if (toggle) {
            picture1.delete();
            picture2.delete();
            picture3.delete();
            picture4.delete();
            picture5.delete();
            picture6.delete();

            picture7.draw();
            picture8.draw();
            picture9.draw();
            picture10.draw();
            picture11.draw();
            picture12.draw();

        } else {
            picture7.delete();
            picture8.delete();
            picture9.delete();
            picture10.delete();
            picture11.delete();
            picture12.delete();

            picture1.draw();
            picture2.draw();
            picture3.draw();
            picture4.draw();
            picture5.draw();
            picture6.draw();
        }
    }

    //SHAPES
    private Picture key1;
    private Picture key2;
    private Picture key3;
    private Picture key4;
    private Picture key5;
    private Picture key6;
    private Picture keyDown;

    private Picture picture1;
    private Picture picture2;
    private Picture picture3;
    private Picture picture4;
    private Picture picture5;
    private Picture picture6;
    private Picture picture7;
    private Picture picture8;
    private Picture picture9;
    private Picture picture10;
    private Picture picture11;
    private Picture picture12;

}
