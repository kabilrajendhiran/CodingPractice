package com.company.demo;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AllPossibleStrings {

   public Set<String> set = new TreeSet<>();

    public void getPermutaion(char[] s,String prefix, int n,int k)
    {
        if(k==0)
        {
            set.add(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(prefix.length()>0 )
            {
                if(isCharacterExists(prefix,s[i]))
                {
                    continue;
                }

            }

            String p = prefix+ s[i];
            getPermutaion(s, p, n, k-1);


        }
    }

    public boolean isCharacterExists(String a, char b)
    {
        char[] ch = a.toCharArray();
        for (char c:ch) {
            if(c==b)
            {
                return true;
            }
        }
        return false;
    }

}
