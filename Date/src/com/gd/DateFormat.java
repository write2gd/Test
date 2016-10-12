/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dasg
 */
public class DateFormat {

    private static java.text.DateFormat formatter = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {
        String target = formatter.format(new Date());
        System.err.println("Time=" + target);
    }
}
