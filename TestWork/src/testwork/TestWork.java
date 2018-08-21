package testwork;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Андрей
 */
public class TestWork {
     
        public static void main(String[] args) {
            System.out.println(" Рандомно созданные фигуры ");
            CreateRandom cr = new CreateRandom();
            cr.createRandomMass();
            cr.createRandomFigures();
            
            
            System.out.println("Задайте параметры для фигур в ручную ");
            
            Square s1 = new Square();
            s1.writeSide();
            Circle c1 = new Circle();
            c1.writeSide();
            Triangle t1 = new Triangle();
            t1.writeSide();
            trapeze tr1 = new trapeze();
            tr1.writeSide();
            System.out.println("Заданные фигуры ");
            
            Object o[] = {s1,c1,t1,tr1};
                for (Object x:o)
                    System.out.println(x);
            
            Square s2 = new Square(140, 120, 1);
            System.out.println(s2.getArea());
            System.out.println(s2.getSideA());
            
            
    }
    
}
