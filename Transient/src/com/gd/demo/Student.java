/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.demo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dasg
 */
public class Student implements Serializable{

    private long id;

    private String studentName;
    private transient int age;//This object will not be Serialized

    public Student(long id, String studentName, int age) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student:{" + "id=" + id + ", studentName=" + studentName + ", age=" + age + '}';
    }

}
