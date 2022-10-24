package com.dsa;

public class largestsumsubarray {
    public static void main(String[] args) {
        //kadane's algorithm
        int [] a={-2,127,6,4,-1,-3,18};
        int cursum=0;
        int [] ele=new int[a.length];
        int b=0;
        int start=0;
        int end=0;
        int ansStart=0;
        int maxsum=Integer.MIN_VALUE;
        for(int k=0;k<a.length;k++){
            cursum+=a[k];
            if(cursum>maxsum){
                maxsum=cursum;
                end=k;
            }
            if(cursum<0){cursum=0;
                start=k;
                ansStart=end-1;
            }

        }
        System.out.println("the maximum sum is: "+maxsum);
        System.out.println("the values of start and end is: "+ansStart+" "+end);

    }
}
