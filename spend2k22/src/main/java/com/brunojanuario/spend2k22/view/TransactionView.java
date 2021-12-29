package com.brunojanuario.spend2k22.view;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Show option to write the amount
 */
@Component
public class TransactionView implements View, KeyboardHandler {

    private Keyboard keyboard;
    private int toggle = 0;
    private String num;
    private String numDraw;

    @Override
    public double show() {
        num = "";
        numDraw = "";
        draw();
        while (toggle != 2) {

            if (keyboard == null) {
                setKeyboard();

            }

            if (!Objects.equals(numDraw, num)) {
                text.setText(num);
                text.draw();
                numDraw = num;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        toggle = 0;

        hide();

        return Double.parseDouble(num);
    }

    private void draw() {
        rectangle2 = new Rectangle(96,182,200,80);
        rectangle2.setColor(Color.WHITE);
        rectangle2.fill();

        keyC = new Picture(96,330, "images/key_C.png");
        keyC.draw();
        euro = new Picture(300,182, "images/euro.png");
        euro.draw();
        keyEnter = new Picture(220, 330, "images/key_enter.png");
        keyEnter.draw();
        head = new Picture(96,22,"images/head.png");
        head.draw();

        text = new Text(126, 240, num);
        text.draw();
        textC = new Text(117, 420, "CLEAR");
        textC.draw();
        textEnter = new Text(220, 420, "CONTINUE");
        textEnter.draw();
    }

    private void hide() {
        rectangle2.delete();

        keyC.delete();
        euro.delete();
        keyEnter.delete();

        text.delete();
        textC.delete();
        textEnter.delete();
        head.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_0:
                num += 0;
                break;
            case KeyboardEvent.KEY_1:
                num += 1;
                break;
            case KeyboardEvent.KEY_2:
                num += 2;
                break;
            case KeyboardEvent.KEY_3:
                num += 3;
                break;
            case KeyboardEvent.KEY_4:
                num += 4;
                break;
            case KeyboardEvent.KEY_5:
                num += 5;
                break;
            case KeyboardEvent.KEY_6:
                num += 6;
                break;
            case KeyboardEvent.KEY_7:
                num += 7;
                break;
            case KeyboardEvent.KEY_8:
                num += 8;
                break;
            case KeyboardEvent.KEY_9:
                num += 9;
                break;
            case KeyboardEvent.KEY_ENTER:
                if (toggle == 0) {
                    num += ".";
                }
                toggle++;
                break;
            case KeyboardEvent.KEY_Q:
                System.exit(0);
                break;
            case KeyboardEvent.KEY_C:
                num = "";
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private void setKeyboard() {
        keyboard = new Keyboard(this);

        setKeyPressed(KeyboardEvent.KEY_0);
        setKeyPressed(KeyboardEvent.KEY_1);
        setKeyPressed(KeyboardEvent.KEY_2);
        setKeyPressed(KeyboardEvent.KEY_3);
        setKeyPressed(KeyboardEvent.KEY_4);
        setKeyPressed(KeyboardEvent.KEY_5);
        setKeyPressed(KeyboardEvent.KEY_6);
        setKeyPressed(KeyboardEvent.KEY_7);
        setKeyPressed(KeyboardEvent.KEY_8);
        setKeyPressed(KeyboardEvent.KEY_9);
        setKeyPressed(KeyboardEvent.KEY_Q);
        setKeyPressed(KeyboardEvent.KEY_C);
        setKeyPressed(KeyboardEvent.KEY_ENTER);
    }

    private void setKeyPressed(int key) {
        KeyboardEvent Press = new KeyboardEvent();
        Press.setKey(key);
        Press.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(Press);
    }

    // SHAPES
    private Rectangle rectangle2;

    private Picture keyC;
    private Picture euro;
    private Picture keyEnter;
    private Picture head;

    private Text text;
    private Text textC;
    private Text textEnter;
}
