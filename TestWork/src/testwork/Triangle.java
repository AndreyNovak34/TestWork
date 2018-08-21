/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Андрей
 */
public class Triangle extends Square {

    private int sideA;
    private int sideB;
    private int sideC;
    private int numColore;
    private Color[] color = {Color.BLACK, Color.RED, Color.GREEN};

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC, int numColore) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.numColore = numColore;

    }
//         @Override
//    public void paintComponent(Graphics g) {
//        this.setBackground(Color.WHITE);
//        Color col = color[numColore];
//
//        g.setColor(col);
//        g.fillPolygon(new int [] {140+sideA, 140, 140}, new int [] {140, 140+sideB, 140}, 3);
//        
//        
//        g.setColor(Color.BLACK);
//        Font font = new Font("Arial", Font.BOLD, 10);
//        g.setFont(font);
//        g.drawString("Треугольник",30,285);
//        //g.drawString("Радиус = " + R,30,315);
//        g.drawString("Цвет = " + getCol(),30,330);
//        g.drawString("Площадь= " + getArea(),30,345);
//          
//    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Color[] getColor() {
        return color;
    }

    public void setColor(Color[] color) {
        this.color = color;
    }

    @Override
    public String toString() {
        //        String x = "Square{" + "Сторона А = " + sideA + " см " + ", Сторона B = " + sideB + " см " + ", Цвет  = " + getCol() + ", Площадь = " + getArea() + '}';
        return "Triangle{" + " Сторона A=" + sideA + ", Сторона B=" + sideB + ", Сторона C=" + sideC + ", Цвет  = " + getCol() + ", Площадь = " + getArea() + '}';
    }

    @Override
    public void writeSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 сторону Треугольника от 1 до 300");
        this.sideA = sc.nextInt();
        if (this.sideA >= 300) {
            this.sideA = 300;
        }
        System.out.println("Введите 2 сторону Треугольника  от 1 до 300");
        this.sideB = sc.nextInt();
        if (this.sideB >= 300) {
            this.sideB = 300;
        }
        System.out.println("Введите 3 сторону Треугольника  от 1 до 300");
        this.sideC = sc.nextInt();
        if (this.sideC >= 300) {
            this.sideC = 300;
        }
        System.out.println("Введите Номер цвета от 0 до 2");
        this.numColore = sc.nextInt();
        if (this.numColore >= 2) {
            this.numColore = 2;
        }
    }

    @Override
    public int getArea() {
        float p = ((this.sideA + this.sideB + this.sideC) * 0.5f);
        float x = (float) Math.sqrt((p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC)));
        return (int) x;

    }

    @Override
    public String getCol() {
        String Col = null;
        if (this.numColore == 0) {
            Col = "Чёрный";
        }
        if (this.numColore == 1) {
            Col = "Красный";
        }
        if (this.numColore == 2) {
            Col = "Зелёный";
        }

        return Col;
    }
        public void DrawPicture(){
          Triangle t1 = new Triangle();
          t1.writeSide();
        JFrame frame = new JFrame();
        frame.setSize(350, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("TEST WORK");
        frame.setLocation(100, 100);
        frame.setResizable(false);
        frame.add(t1);
        
    }

}
