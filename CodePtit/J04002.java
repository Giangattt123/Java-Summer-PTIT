/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Scanner;

class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
        width = 1;
        height = 1;
    }
    
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
     public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }
    
    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    
    @Override
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  width = sc.nextDouble();
        double  height = sc.nextDouble();
        String color = sc.next();
        if (width > 0 && height > 0)  {
            Rectange rec = new Rectange(width, height, color);
            System.out.println(rec);
        } else {
            System.out.println("INVALID");
        }
    }
}
