package com.nt.main;

import com.nt.service.ArithmeticOperation;

public class App 
{
    public static void main( String[] args )
    {
       ArithmeticOperation ar=new ArithmeticOperation();
       int resSum=ar.sum(100,200);
       int resSub=ar.sub(30,20);
       System.out.println("sum::"+resSum);
       System.out.println("subraction::"+resSum);
       System.out.println("multification::"+ar.mul(100, 300));

       System.out.println("-------------==========");//123098


    }
}
