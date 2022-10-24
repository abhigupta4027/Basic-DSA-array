package com.dsa;

public class minsumsubarray {
    static int minimumsumsubarray(int [] arr){
        int len=arr.length;
        int [] arr1=new int[len];
        int j=0;
        int minsum=Integer.MAX_VALUE;
        int cursum=0;
        int start,ansStart,end=0;
        int numofchange=0;
        for(int i=0;i<len;i++){
            if(cursum+arr[i]<minsum){cursum+=arr[i];
                if (cursum<minsum){
                    arr1[0]=arr[i];
                    j++;}
                end=i;

                minsum=cursum;
            }

            else{cursum=0;
                start=i;}
        }
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        return minsum;
    }
    public static void main(String[] args) {
        int []arr={-51,-45,-91,4,-7,4,3,-111};
        System.out.println(minimumsumsubarray(arr));
    }
}
