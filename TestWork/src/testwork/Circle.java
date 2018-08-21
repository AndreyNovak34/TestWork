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
public class Circle extends Square {

    int R;
    private int numColore;
    private Color[] color = {Color.BLACK, Color.RED, Color.GREEN};

    public Circle() {
    }

    
    public Circle(int R, int numColore) {
        this.R = R;
        this.numColore = numColore;
    }
//      @Override
//    public void paintComponent(Graphics g) {
//        this.setBackground(Color.WHITE);
//        Color col = color[numColore];
//
//        g.setColor(col);
//        g.fillOval(350/2 - R, 350/2 -R,R*2,R*2);
//        
//        g.setColor(Color.BLACK);
//        Font font = new Font("Arial", Font.BOLD, 10);
//        g.setFont(font);
//        g.drawString("КРУГ",30,285);
//        g.drawString("Радиус = " + R,30,315);
//        g.drawString("Цвет = " + getCol(),30,330);
//        g.drawString("Площадь= " + getArea(),30,345);
//          
//    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.R;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        if (this.R != other.R) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //String x = , Цвет  = " + getCol() + ", Площадь = " + getArea() + '}';
        return "Circle{" + "Радиус = " + R + ",Цвет  = " + getCol() + ", Площадь = " + getArea() + '}';
    }

    @Override
    public void writeSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус Окружности 1 до 150");
        this.R = sc.nextInt();
        if (this.R >= 150) {
            this.R = 150;
        }
         System.out.println("Введите Номер цвета от 0 до 2");
        this.numColore = sc.nextInt();
        if (this.numColore >= 2) {
            this.numColore = 2;
        }
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

    @Override
    public int getArea() {
        float p = 3.14f;
        return (int) (p *(this.R*this.R));
    }
      public void DrawPicture(){
          Circle c1 = new Circle();
          c1.writeSide();
        JFrame frame = new JFrame();
        frame.setSize(350, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("TEST WORK");
        frame.setLocation(100, 100);
        frame.setResizable(false);
        frame.add(c1);
        
    }
}
