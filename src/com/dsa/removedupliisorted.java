package com.dsa;

import java.util.Scanner;

public class removedupliisorted {
    public static void main(String[] args) {
        //largest element in an array
        int[] arr = {2,2,5,5,9,12,12,19,21,45,94,94,105};
        Scanner scn = new Scanner(System.in);
        int len=arr.length;
        int j=0;
        for(int i=0;i<len;i++){
                if (arr[i] != arr[j]) {
                    arr[j+1] = arr[i];
                    j++;
                }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

}
