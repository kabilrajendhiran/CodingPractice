package com.company.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOperations {

    public void union(ArrayList<Integer> lst1 ,ArrayList<Integer> lst2)
    {
        ArrayList<Integer> list1 = new ArrayList<>(lst1);
        ArrayList<Integer> list2 = new ArrayList<>(lst2);

        /*ArrayList<Integer> common=new ArrayList<>();


        for (int i = 0; i < list2.size(); i++) {
            if(isNumberExist(list1.get(i),list2))
            {
                common.add(list1.get(i));
            }else
            {
                common.add(list1.get(i));
                common.add(list2.get(i));
            }
        }

        System.out.println(Arrays.toString(common.toArray()));*/


        for (int i:list2) {
            if(!isNumberExist(i,list1))
            {
                list1.add(i);
            }
        }

        System.out.println(Arrays.toString(list1.toArray()));


    }

    public void except(ArrayList<Integer> lst1 ,ArrayList<Integer> lst2)
    {
        ArrayList<Integer> list1 = new ArrayList<>(lst1);
        ArrayList<Integer> list2 = new ArrayList<>(lst2);


        list1.removeIf(s->s%2!=0);
        list2.removeIf(s->s%2==0);

        list1.addAll(list2);
        System.out.println(Arrays.toString(list1.toArray()));

    }

    public void intersect(ArrayList<Integer> lst1 ,ArrayList<Integer> lst2)
    {
        ArrayList<Integer> list1 = new ArrayList<>(lst1);
        ArrayList<Integer> list2 = new ArrayList<>(lst2);

        for (int i=0; i<list1.size();i++) {
            if(!isNumberExist(list1.get(i),list2))
            {
                list1.remove(list1.get(i));
            }
        }
        System.out.println(Arrays.toString(list1.toArray()));
    }


    public boolean isNumberExist(int n, ArrayList<Integer> list)
    {
        for (int num:list) {
            if(num==n)
            {
                return true;
            }
        }
        return false;
    }




}

