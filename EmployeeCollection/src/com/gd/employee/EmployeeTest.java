/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.employee;

import java.util.Arrays;

/**
 *
 * @author dasg
 */
public class EmployeeTest {

    public static void main(String[] args) {

        //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Anup", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Gouranga", 32, 50000);

        Arrays.sort(empArr);
        System.out.println("Default Sorting :\n" + Arrays.toString(empArr));

        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Salary wise Sorting:\n" + Arrays.toString(empArr));

        Arrays.sort(empArr, Employee.AgeComparator);
        System.out.println("Age Salary wise Sorting:\n" + Arrays.toString(empArr));

        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Name Salary wise Sorting:\n" + Arrays.toString(empArr));

    }
}
