/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork;

import java.awt.Color;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Андрей
 */
public class trapeze extends Square{

    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private int numColore;
    private Color[] color = {Color.BLACK, Color.RED, Color.GREEN};

    public trapeze() {
    }

    public trapeze(int sideA, int sideB, int sideC, int sideD,int numColore) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.numColore = numColore;
    }

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

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
    }

    public int getNumColore() {
        return numColore;
    }

    public void setNumColore(int numColore) {
        this.numColore = numColore;
    }

    public Color[] getColor() {
        return color;
    }

    public void setColor(Color[] color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.sideA;
        hash = 89 * hash + this.sideB;
        hash = 89 * hash + this.sideC;
        hash = 89 * hash + this.sideD;
        hash = 89 * hash + this.numColore;
        hash = 89 * hash + Arrays.deepHashCode(this.color);
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
        final trapeze other = (trapeze) obj;
        if (this.sideA != other.sideA) {
            return false;
        }
        if (this.sideB != other.sideB) {
            return false;
        }
        if (this.sideC != other.sideC) {
            return false;
        }
        if (this.sideD != other.sideD) {
            return false;
        }
        if (this.numColore != other.numColore) {
            return false;
        }
        if (!Arrays.deepEquals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trapeze{" + "sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", sideD=" + sideD + ", Цвет  = " + getCol() + ", Площадь = " + getArea() + '}';
    }

    @Override
    public void writeSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 сторону Трапеции от 1 до 300");
        this.sideA = sc.nextInt();
            if (this.sideA >=300){
                this.sideA = 300;
            }
        System.out.println("Введите 2 сторону Трапеции  от 1 до 300");
        this.sideB = sc.nextInt();
             if (this.sideB >=300){
                this.sideB = 300;
            }
        System.out.println("Введите 3 сторону Трапеции  от 1 до 300");
        this.sideC = sc.nextInt();
             if (this.sideC >=300){
                this.sideC = 300;
            }
        System.out.println("Введите 4 сторону Трапеции  от 1 до 300");
        this.sideD = sc.nextInt();
             if (this.sideD >=300){
                this.sideD = 300;
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
     int a = this.sideA;
     int b = this.sideB;
     int c = this.sideC;
     int d = this.sideD;
     
     float S = (float) ((a+b)/2);
     float S2 = (float) Math.sqrt(Math.pow(c,2)-Math.pow((((b-a)*(b-a))+((c)*(c))-((d)*(d)))/(2*(b-a)), 2));
     float S3 = S*S2;
        
     return (int) S3;
    }
    
    
}
