package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int x=10;
//        JFrame jFrame = new JFrame("Test");
//        jFrame.setLayout(new FlowLayout());
//        jFrame.setSize(800,800);
//        jFrame.add(new JLabel("text"));
//        jFrame.add(new JButton("Ok"));
//
//
//        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jFrame.pack();
//        jFrame.setVisible(true);
//
//
        g(1);

    }
    static void g(int i){
        try{
            g(++i);
        }catch (StackOverflowError e){
            System.out.println("слишком большой стек вызова " + i);
        }

    }

}
