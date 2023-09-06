package com.programming.class_6;

public class GeneralizedMethod {
public static void main(String[] args) {

        Integer[] intArr= {10,4,5,3,5,6,8,23};

        String[] strArr= {"Z","A","X","B","W"};

        

        System.out.println("Printing integer array");

        printArray(intArr);

        

        System.out.println("Printing string array");

        printArray(strArr);

    }

    static <E> void printArray(E[] elements)

    {

        for(E e: elements)

        {

            System.out.print(e+" ");

        }

        System.out.println();

    }

 

}

 