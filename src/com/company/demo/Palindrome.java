package com.company.demo;

public class Palindrome {
    public void convertToPalindrome(int n)
    {
        // 1 -11
        //2 - 22
        //11 -111

        n = n*10 + n%10;
        System.out.println(n);
    }
}
