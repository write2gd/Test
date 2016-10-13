/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dasg
 */
public class Serializing {

    public static void main(String args[]) throws Exception {
        Student s1 = new Student(143, "Gouranga Das", 29);//creating object  
        //writing object into file  
        FileOutputStream f = new FileOutputStream("gd.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        f.close();
        System.out.println("Student Object was Serialized and Stored Successfully ");
    }
}
