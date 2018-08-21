/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork;

import java.util.Random;

/**
 *
 * @author Андрей
 */
public class CreateRandom {

    public testwork.Square Square() {
        Random R = new Random();
        Square s1 = new Square(R.nextInt(150) + 1, R.nextInt(150) + 1, R.nextInt(2));
        return s1;
    }

    public testwork.Circle Circle() {
        Random r = new Random();
        Circle c1 = new Circle(r.nextInt(150), 2);
        return c1;
    }

    public testwork.Triangle Triangle() {
        Random r = new Random();
        Triangle t1 = new Triangle(r.nextInt(30) + 50, r.nextInt(30) + 50, r.nextInt(30) + 50, r.nextInt(2));
        return t1;
    }

    public testwork.trapeze Trapeze() {
        Random r = new Random();
        int i = r.nextInt(120) + 50;
        trapeze tr1 = new trapeze(r.nextInt(70) + 30, r.nextInt(150) + 80, i, i, r.nextInt(2));
        return tr1;
    }

    public Object createRandomFigures() {
        Random r = new Random();
        int i = r.nextInt(4) + 1;
        CreateRandom cr = new CreateRandom();
        Object x = new Object();
        if (i == 1) {
            x = cr.Circle();
              
        }
        if (i == 2) {
            x = cr.Square();

        }
        if (i == 3) {
            x = cr.Trapeze();

        }
        if (i == 4) {
            x = cr.Triangle();

        }

        return x;
    }

    public void createRandomMass() {
        Random r = new Random();
        CreateRandom cr = new CreateRandom();
        int a = r.nextInt(10) + 4;
        Object[] x = new Object[a];
        for (int i = 0; i < x.length; i++) {
            x[i] = cr.createRandomFigures();
            System.out.println(x[i]);
        }
        System.out.println("Количество фигур в массиве = " + x.length);

    }
  
}
