package com.company;


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int bi = s.nextInt();
        int pow=1;
        int rem;
        int n = bi;
        int binary=0;
        while(n>0)
        { rem = n%2;
            binary +=rem*pow;
            pow = pow*10;
            n=n/2;

        }
        System.out.println(" "+ binary);
    }
}
