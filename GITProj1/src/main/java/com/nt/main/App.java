package com.nt.main;

import com.nt.service.ArithmeticOperation;

public class App 
{
    public static void main( String[] args )
    {
       ArithmeticOperation ar=new ArithmeticOperation();
       ar.sum(100,200);
       ar.sub(30,20);
    }
}
