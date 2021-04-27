package com.company.demo;

import java.util.Arrays;

public class PrimeNumber {

    public void greatestPrimeNumber(int[] a)
    {

        int prime =  numberFactory(a);

        if(checkPrime(prime)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }


    }

    public boolean checkPrime(int n)
    {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int numberFactory(int[] a)
    {
        int  num = 0;
        for (int j : a) {
            num = num * 10 + j;
        }
        return num;
    }

    public void subsetFactory(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            
        }
    }


}
