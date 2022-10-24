package com.dsa;

public class transposeandrotate {
    static void rotate(int [] [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int swap=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=swap;
            }
        }
        System.out.println("The transpose of given matrix is: ");
        for(int k=0;k<n;k++){
            for(int y=0;y<n;y++){
                System.out.print(arr[k][y]+" ");
            }
            System.out.println(" ");
        }
        for(int l=0;l<n;l++){
            for(int p=0;p<n/2;p++){
                int swap=arr[l][p];
                arr[l][p]=arr[l][n-p-1];
                arr[l][n-p-1]=swap;
            }
        }
        System.out.println("The rotated matrix is : ");
        for(int k=0;k<n;k++){
            for(int y=0;y<n;y++){
                System.out.print(arr[k][y]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
}