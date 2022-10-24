package com.dsa;

public class containerwithmostwater {
    public static void main(String[] args) {

        int [] sides={1,8,6,2,4,5,8,3,7};
        int l=0;
        int r=sides.length-1;
        int maxarea=0;
        while(l<r){
            int height=Math.min(sides[l],sides[r]);
            int area=(r-l)*height;
            maxarea=Math.max(area,maxarea);
            if(sides[l]>sides[r]){r--;}
            else l++;
        }
        System.out.println("the maximum area is: "+maxarea);

    }

}
