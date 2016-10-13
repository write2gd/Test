/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author dasg
 */
public class DeSerializing {

    public static void main(String args[]) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("gd.txt"));
        Student s = (Student) in.readObject();
        System.out.println(s.toString());//As ID is transient and not serialized it will give default value.
        in.close();
    }
}
