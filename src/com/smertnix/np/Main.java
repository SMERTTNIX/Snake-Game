package com.smertnix.np;
import javax.swing.*;

public class Main extends JFrame {

public Main() {
    setTitle("SNAKE GAME");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(320, 345);
    setLocation(400, 400);
    add(new GameField());
    setVisible(true);
}

public static void main (String[] args ){
    Main mw = new Main();

}
}