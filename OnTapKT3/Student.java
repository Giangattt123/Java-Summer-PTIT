/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    private int code;
    private String name;
    public Student(){};

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public String toString() {
        return code + " " + name;
    }
}
