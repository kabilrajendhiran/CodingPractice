package com.company.demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] friendsArray = {"Kumar","Raju","Murali"};
        String[][] fofArray={{"Prabhu","Mani","Raju"},{"Guru", "Murali", "Mukundh"},{"Guru", "Prakash", "Hari", "Babu"}};


        Friend friend = new Friend("ME");

/*
        Scanner scanner = new Scanner(System.in);

 for (int i = 0; i < 3; i++) {
     String name = scanner.next();                       // kumar
     int friendCount = scanner.nextInt();                // 3
     Friend friend1 = new Friend(name);
     for (int j = 0; j < friendCount; j++) {
         String fName = scanner.next();                  // Prabhu Mani Raju
         Friend friend2 = new Friend(fName);
         friend1.getFriends().put(fName,friend2);
     }
     System.out.println(friend1.toString());

 }
*/


        for (int i = 0; i < fofArray.length; i++) {
            Friend friend1 = new Friend(friendsArray[i]);
            for (int j = 0; j < fofArray[i].length; j++) {
                Friend friend2 = new Friend(fofArray[i][j]);
                friend1.getFriends().put(friend2.getName(),friend2);
            }
            friend.getFriends().put(friend1.getName(),friend1);
        }

  //  fof(friend);

        System.out.println();

        System.out.println("Question 2");

        String word = "STEAD";
        int[] wordValue = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            int s= word.charAt(i)-64;
            wordValue[i] = s;
        }

        for (int i = 0; i < wordValue.length; i++) {
            int lhs = 0;
            int rhs = 0;
            int distance1 =0;
            int distance2 = 0;
            for (int j = 0; j < wordValue.length; j++) {

                if(j<i)
                {
                    distance1++;
                    lhs = lhs + (wordValue[j]*distance1);
                }
                else if(j>i)
                {
                    distance2++;
                    rhs = rhs + (wordValue[j]*distance2);
                }
            }
            if (lhs==rhs)
            {
                System.out.println("Balanced at " + word.charAt(i));
                break;
            }
        }

        System.out.println("\nQuestion 3");
        Palindrome palindrome = new Palindrome();
        palindrome.convertToPalindrome(11);
        palindrome.convertToPalindrome(2);

// Question 4
        // Not Working
        System.out.println("\nQuestion 4");
       // int[] arr = {4, 3, 1, 9, 6};
         int[] arr = {3, 1, 0};
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.greatestPrimeNumber(arr);

// Question 5

        System.out.println("\nQuestion 5");

        ArrayList<Task> tasks = new ArrayList<>();
        Task task1 = new Task(1130,1400);
        Task task2 = new Task(1200,1400);
        Task task3 = new Task(1000,1300);
        Task task4 = new Task(1400,1600);
        Task task5 = new Task(1600,1800);
        Task task6 = new Task(1600,1800);

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);

        TaskScheduler taskScheduler = new TaskScheduler();
        taskScheduler.scheduleTask(tasks);

// Question 6
        System.out.println("\nQuestion 6");
        UglyNumbers uglyNumbers = new UglyNumbers();
        uglyNumbers.findUglyNumber(7);

// Question 7
        System.out.println("\nQuestion 7");
        ListOperations listOperations = new ListOperations();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);    list2.add(1);
        list1.add(2);    list2.add(7);
        list1.add(5);    list2.add(5);
        list1.add(3);    list2.add(8);
        list1.add(8);    list2.add(8);
        list1.add(9);



        listOperations.union(list1,list2);
        listOperations.except(list1,list2);
        listOperations.intersect(list1,list2);

// Question 8
        System.out.println("\nQuestion 8");
        String sentence = "OneTwoOneTwoOneTwoOne";
        FillAndFindWordInMatrix findWordInMatrix = new FillAndFindWordInMatrix();
        findWordInMatrix.fillMatrix(sentence);

//Question 9
        System.out.println("\nQuestion 9");
        MagicalString magicalString = new MagicalString();
        magicalString.findMagicalString("aaa","zzz");
        magicalString.findMagicalString("a","c");
        magicalString.findMagicalString("abcdefg","abcdefg");

//Question 10
        System.out.println("\nQuestion 10");
        int input=3434;
        ChangeToCombination changeToCombination =
                new ChangeToCombination();

        changeToCombination.findSolution(input);

//Question 11
        System.out.println("\nQuestion 11");
        String inp ="PROGRAM";
        StringPatternPrinting spp = new StringPatternPrinting();
        spp.printPattern(inp);


//Question 12
        System.out.println("\nQuestion 12");
        char[] set1 = {'a', 'b', 'c'};
        int k = 3;
        AllPossibleStrings allPossibleStrings = new AllPossibleStrings();

        for (int i = 1; i <= k; i++) {
            allPossibleStrings.getPermutaion(set1,"", set1.length, i);
        }

        for (String s:allPossibleStrings.set) {
            System.out.println(s);
        }

//Question 13

        // Not Working
        int[] array = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int[] array1 = {1,6,2,3,4,5};
        LongestIncreasingSubSequence liss = new LongestIncreasingSubSequence();
        int[] arr3 = liss.removeBarrierNumbers(array1);
        System.out.println(arr3.length);
        System.out.println(Arrays.toString(arr3));


    }









}
