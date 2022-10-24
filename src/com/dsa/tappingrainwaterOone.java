package com.dsa;

public class tappingrainwaterOone {
    static int tappingwater(){
        int maxwater=0;
        int [] a={1,0,2,1,0,1,3,2,1,2,1};
        int len=a.length;
        int [] left=new int[len];
        int [] right=new int[len];

        int leftmax=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            left[i]=Math.max(a[i],leftmax);
            leftmax=Math.max(a[i],leftmax);
        }
        System.out.println("left arrar: ");
        for(int ele:left){
            System.out.print(ele+" ");
        }

        int rightmax=Integer.MIN_VALUE;
        for(int i=len-1;i>=0;i--){
            right[i]=Math.max(a[i],rightmax);
            rightmax=Math.max(a[i],rightmax);
        }
        int o=len-1;
        System.out.println("right arrar: ");
        for(int ele:right){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int k=0;k<len;k++){
            maxwater=(Math.min(left[k],right[k])-a[k])+maxwater;
        }


        return maxwater;
    }
    public static void main(String[] args) {
        int p=tappingwater();
        System.out.println(p);
    }

}
