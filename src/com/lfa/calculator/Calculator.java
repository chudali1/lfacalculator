/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.calculator;

import com.lfa.calculator.ci.CompoundInterest;
import java.util.Scanner;



/**
 *
 * @author USER
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompoundInterest ci = new CompoundInterest();
        System.out.println("Enter Principle");
        ci.setPrinciple(sc.nextDouble());
        System.out.println("Enter Rate");
        ci.setRate(sc.nextDouble());
        System.out.println("Enter Time");
        ci.setTime(sc.nextDouble());
        
        System.out.println("The Compound Interest is : "+ci.getComoundInterest());
    }

}
