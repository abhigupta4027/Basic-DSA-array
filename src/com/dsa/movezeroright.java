package com.dsa;

public class movezeroright {
    static void movezeroright(int [] arr){
        int len=arr.length;
        int []arr1=new int[len] ;
        int j=0;
        int numzero=0;
        for(int i=0;i<len;i++){
            if(arr[i]==0){
                numzero=numzero+1;
            }
            else{
                arr1[j]=arr[i];
                j=j+1;
            }
        }
        for(int k=j+1;k<len;k++){
            arr1[k]=0;
        }
        arr=arr1;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arry={0,1,54,0,36,12,0,8,2,0,47,3,0,14,9,0,47,4,0};
        movezeroright(arry);
    }
}
