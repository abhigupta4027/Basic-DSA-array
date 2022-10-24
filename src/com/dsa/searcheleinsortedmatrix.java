package com.dsa;
public class searcheleinsortedmatrix {
    static boolean searchelementinsortedmatrix(int[][] arr, int keytosearch) {
        int key = keytosearch;
        int n = arr.length;
        boolean found=false;
        int i = 0;
        int j = n - 1;
        int curele = 0;
        while (i<n && j>=0) {
            curele = arr[i][j];
            if (key > curele) {
                if(i<=n-2){i++;}
                else{break;}
            } else if (key < curele) {
                if(j>=1){j--;}
                else{break;}
            }
            else if (curele == key) {
                System.out.println("The element is found at " + i + " " + j + "  index");
                found=true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int [] [] matrix={{1,4,5,7},{2,5,6,9},{6,10,11,13},{9,14,16,18}};
        System.out.println(searchelementinsortedmatrix(matrix,16));
    }
}
