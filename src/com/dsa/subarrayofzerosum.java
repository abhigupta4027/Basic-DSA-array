//package com.dsa;
//
//public class subarrayofzerosum {
//    static boolean subarrayzerosum(int [] a){
//        int len=a.length;
//        int cursum=a[0];
//        int sum=0;
//        for(int i=1;i<len;i++){
//
//            if(sum>=0 && a[i]<=0){cursum=cursum+a[i];}
//            else if(sum<0 && a[i]>0){cursum=cursum+a[i];}
//        }
//    }
//}
