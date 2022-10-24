package com.dsa;
public class longestarrayofone {
    static int longestarrayofone(int [] arr){
        int freq=0;
        int maxone=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){freq=freq+1;}
            else{
                if(maxone<freq){
                    maxone=freq;
                }
                freq=0;
            }
        }
        return maxone;
    }
    public static void main(String[] args) {
        int [] arr={1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0,1,0};
        System.out.println((longestarrayofone(arr)));
    }
}
