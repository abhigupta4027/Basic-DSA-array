package com.dsa;

import java.util.Scanner;

public class larrgestele {
    public static void main(String[] args) {
        //largest element in an array
        Scanner scn = new Scanner(System.in);
        int[] arr1 = {50, 4758, 21, 697, 54,34,354,151};
//        int largestele=arr1[0];
//        int ind=0;
//        for(int a=1;a<arr1.length;a++){
//            if(arr1[a]>largestele){
//                largestele=arr1[a];
//                ind=a;
//            }
//        }
//        System.out.println("The largest ele is: "+largestele+" at "+ind+" index");
        int largest=0;int seclargest=-1;
        for(int s=0;s<arr1.length;s++){
            if(arr1[s]>arr1[largest]){
                seclargest=largest;
                largest=s;
            }
            else if(arr1[s]<arr1[largest]){
                if(seclargest==-1||arr1[s]>arr1[seclargest]){
                    seclargest=s;
                }
            }
        }
        System.out.println("The second largest element is: "+arr1[seclargest]);
    }
}
