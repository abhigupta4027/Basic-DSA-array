package com.dsa;
import javax.sound.midi.Track;
import java.util.Scanner;
public class arraysearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Searching an element
//        int[] arr1 = {5, 458, 21, 697, 54};
//        int key = scn.nextInt();
//        boolean find= false; int a=0;
//        for (int i=0;i<arr1.length;i++) {
//            if(arr1[i]==key){
//                find=true;
//                a=i;
//            }
//        }
//        if(find){
//            System.out.println("The element is found at index: "+(a+1));
//        }
//        else{
//            System.out.println("Element is not found.");
//        }
        int[] arr1 = {5, 458, 21, 697, 54};
        System.out.println("Enter the element you want to delete: ");
        int key = scn.nextInt();
        boolean find= false;
        int a=0;
        for (int i=0;i<arr1.length;i++) {
            if(arr1[i]==key){
                find=true;
                a=i;
                break;
            }
        }
        if(find){
            for(int s=a;s<arr1.length;s++){
                arr1[a]=arr1[a+1];
            }
        }
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
    }
}
