/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Product1 implements Comparable<Product1> {
    private String id, name;
    private int price, banHanh;

    public Product1(String id, String name, int price, int banHanh) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.banHanh = banHanh;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + banHanh;
    }

    @Override
    public int compareTo(Product1 other) {
        if (this.price == other.getPrice()) {
            return id.compareTo(other.getId());
        }
        return -(this.price - other.getPrice());
    }
}

public class J07048 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        Product1[] products = new Product1[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int baoHanh = Integer.parseInt(sc.nextLine());
            products[i] = new Product1(id, name, price, baoHanh);
        }
        Arrays.sort(products);
        for (Product1 item : products) {
            System.out.println(item);
        }
    }
}

