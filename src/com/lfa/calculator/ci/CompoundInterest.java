/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.calculator.ci;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CompoundInterest {

    Scanner sc = new Scanner(System.in);
    private double principle, rate, time;

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getRate() {

        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getComoundInterest() {
        double a =  (1 + rate);
        double b = Math.pow(a, time);
        return (principle*b);
    }
}
