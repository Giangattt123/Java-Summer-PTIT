/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class IOMainFile {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        lists.add(new Student(1 , "Phung Duc Giang"));
        lists.add(new Student(2 , "Phung Duc Manh"));
        lists.add(new Student(3 , "Nguyen Manh Hung"));
        lists.add(new Student(4 , "Tran Van Minh"));
        String fileAbs = "src\\File\\students.dat";
        IOFile.write(fileAbs, lists);
        List<Student> listSV = IOFile.read(fileAbs);
//        for (Student st : listSV) {
//            System.out.println(st);
//        }
        listSV.stream().forEach(st -> System.out.println(st));
    }
    
}
