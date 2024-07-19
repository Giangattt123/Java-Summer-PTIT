/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Edge {
        public int dinhDau , dinhCuoi;
        public Edge(int dinhDau , int dinhCuoi) {
            this.dinhDau = dinhDau;
            this.dinhCuoi = dinhCuoi;
        }
}
public class J02104 {
    private static List<Edge> solve(int [][] a , int n) {
        List<Edge> lists = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                if (a[i][j] == 1) {
                    Edge list = new Edge(i + 1, j + 1);
                    lists.add(list);
                }
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int [n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        List<Edge> ds = solve(a, n);
        for (Edge item : ds) {
            System.out.println("(" + item.dinhDau + "," + item.dinhCuoi + ")");
        }
    }
}
/*
Test
6
0 1 1 0 1 0
1 0 1 0 1 0
1 1 0 1 0 0
0 0 1 0 1 1
1 1 0 1 0 1
0 0 0 1 1 0
Ouput:
(1,2)
(1,3)
(1,5)
(2,3)
(2,5)
(3,4)
(4,5)
(4,6)
(5,6)
*/