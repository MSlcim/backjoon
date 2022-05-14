package com.algorithm;

import java.util.Scanner;

public class 하노이탑 {

    public static void main(String[] args) {
        hanoi(1,2,3,4);
    }
    public static void hanoi(int start, int mid, int destination, int num){
        if(num ==0)
            return;
        hanoi(start,destination,mid,num-1);
        System.out.printf("%d번: %d -> %d\n",num,start,destination);
        hanoi(mid,start,destination,num-1);
    }
}
