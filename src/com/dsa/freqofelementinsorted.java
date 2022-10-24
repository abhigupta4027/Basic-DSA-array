package com.dsa;

public class freqofelementinsorted {
    static void frequencyelement(int[] ar){
        int freq=1;
        for(int i=1;i<ar.length;i++){
            if(ar[i]==ar[i-1]){
                freq++;
            }
            else{
                System.out.println("The frequency of "+ar[i-1]+" is: "+freq);
                freq=1;
            }
        }
        System.out.println("The frequency of "+ar[(ar.length-1)]+" is: "+freq);
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,3,4,5,6,7,7,7,7,8,9,10,25,25,25,25,25};
        frequencyelement(arr);

    }

}
