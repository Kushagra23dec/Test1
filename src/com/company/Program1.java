package com.company;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x=-1;
        System.out.println("Enter the Number; ");
        int p = i.nextInt();

        for(int j=2;j<=p/2; j++){
            if(p%j==0){
                System.out.println("Not Prime"); x=1;
                break;
            }
        }
        if(x==-1){
            System.out.println("Prime Number");
        }

    }
}
