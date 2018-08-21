/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Андрей
 */
public class Square extends JPanel implements ActionListener {

    private int sideA;
    private int sideB;
    private int numColore;
    private Color[] color = {Color.BLACK, Color.RED, Color.GREEN};
    
    
   
 
 
    public Square() {
    }

    public Square(int sideA, int sideB, int numColore) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.numColore = numColore;

    }

  
//    @Override
//    public void paintComponent(Graphics g) {
//        
//        this.setBackground(Color.WHITE);
//        Color col = color[numColore];
//
//        g.setColor(col);
//        g.fillRect(350/ 2 - sideA / 2, 350 / 2 - sideB / 2, sideA, sideB);
//        
//        g.setColor(Color.BLACK);
//        Font font = new Font("Arial", Font.BOLD, 10);
//        g.setFont(font);
//        g.drawString("КВАДРАТ",30,285);
//        g.drawString("Сторона А = " + sideA,30,300);
//        g.drawString("Сторона B = " + sideB,30,315);
//        g.drawString("Цвет = " + getCol(),30,330);
//        g.drawString("Плошадь = " + getArea(),30,345);
//          
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.sideA;
        hash = 37 * hash + this.sideB;
        hash = 37 * hash + Objects.hashCode(this.color);
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
        final Square other = (Square) obj;
        if (this.sideA != other.sideA) {
            return false;
        }
        if (this.sideB != other.sideB) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String x = "Square{" + "Сторона А = " + sideA + " см " + ", Сторона B = " + sideB + " см " + ", Цвет  = " + getCol() + ", Площадь = " + getArea() + '}';
        return x;
    }

    public int getArea() {
        
        return this.sideA * this.sideB;
    }

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

    public void writeSide() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону А от 1 до 300");
        this.sideA = sc.nextInt();
            if (this.sideA >=300){
                this.sideA = 300;
            }
        System.out.println("Введите сторону Б от 1 до 300");
        this.sideB = sc.nextInt();
             if (this.sideB >=300){
                this.sideB = 300;
            }
        System.out.println("Введите Номер цвета от 0 до 2");
        this.numColore = sc.nextInt();
        if (this.numColore >= 2) {
            this.numColore = 2;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
//    public void DrawPicture(){
//        Square s1 = new Square();
//        s1.writeSide();
//        JFrame frame = new JFrame();
//        frame.setSize(350, 400);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setTitle("TEST WORK");
//        frame.setLocation(100, 100);
//        frame.setResizable(false);
//        frame.add(s1);
//        
//    }
  

}
