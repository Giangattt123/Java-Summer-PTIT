/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J04001 {
    class Point {

        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        private Point() {
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        double khoangCach(Point a, Point b) {
            return sqrt(pow(a.getX() - b.getX(), 2) + pow(a.getY() - b.getY(), 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            J04001 classPoint = new J04001();
            Point PointA = classPoint.new Point(a, b);
            Point PointB = classPoint.new Point(c, d);
            Point PointC = classPoint.new Point();
            System.out.printf("%.4f\n" , PointC.khoangCach(PointA, PointB));
        }
    }
}
