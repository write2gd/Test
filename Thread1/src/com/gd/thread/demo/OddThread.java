/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.thread.demo;

/**
 *
 * @author dasg
 */
class OddThread implements Runnable {

    public static volatile boolean isRun = false;
    private int k = 1;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (isRun) {
                System.out.println(k);
                isRun = false;
                EvenThread.isRun = true;
                if (k == 29) {
                    Thread.currentThread().interrupt();
                }
                k += 2;
            }
        }

    }
}
