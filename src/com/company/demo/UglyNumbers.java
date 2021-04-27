package com.company.demo;

public class UglyNumbers {

    public int greatestDivisblePower(int n, int d)
    {
        while (n%d==0)
        {
            n = n/d;
        }

        return n;
    }

    public void findUglyNumber(int n)
    {
        int i = 0, count =0;

        while(n>count) {
            i++;
            int n1 = greatestDivisblePower(i,2);
            n1 = greatestDivisblePower(n1,3);
            n1 = greatestDivisblePower(n1,5);

            if(n1==1)
            {
                count++;
            }

        }
        System.out.println("The "+n+"th ugly number is "+ i);

    }




}
