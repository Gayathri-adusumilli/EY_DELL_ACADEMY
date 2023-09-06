package com.programming.class_10;

public class QuickSort {

	public static void main(String[] args) {

        // TODO Auto-generated method stub

        int[]intArr= {3,60,35,2,45,320,-5};

        int lengthOfArray = intArr.length;

        System.out.println("before quick sort");

        for(int i=0;i<intArr.length;i++) {

            System.out.print(intArr[i]+" ");

        }

        QuickSort.quickSort(intArr,0,lengthOfArray -1);

        System.out.println();

        

        System.out.println("after quick sort");

        for(int i=0;i<intArr.length;i++) {

            System.out.print(intArr[i]+" ");

        }

 

    }

    static void quickSort(int[] intArr,int startElement,int endElement) {

        if(startElement<endElement) {

            int p= partition(intArr,startElement,endElement);

            quickSort(intArr,startElement,p-1);

            quickSort(intArr,p+1,endElement);

        }

    }

        static int partition(int[] intArr,int startPosition,int endPosition) {

            int pivotElement= intArr[endPosition];

            int i=(startPosition-1);

            

        for(int j=startPosition;j<=endPosition;j++) {

            if(intArr[j]<pivotElement) {

                i++;

                int t=intArr[i];

                intArr[i]=intArr[j];

                intArr[j]=t;

            }

        }

        int t= intArr[i+1];

        intArr[i+1]= intArr[endPosition];

        intArr[endPosition]=t;

        return(i+1);

        

    }

}

