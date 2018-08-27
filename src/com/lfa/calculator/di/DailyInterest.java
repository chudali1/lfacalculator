/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.calculator.di;

import com.lfa.calculator.ci.CompoundInterest;

/**
 *
 * @author USER
 */
public class DailyInterest extends CompoundInterest{
   CompoundInterest di = new DailyInterest();
   
   public double getDailyInterest(){
   return 5.0;
   }
    
}
