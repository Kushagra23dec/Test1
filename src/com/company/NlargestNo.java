package com.company;

import java.util.Scanner;

public class NlargestNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("N Digit Number: ");
        int p = s.nextInt();
        System.out.println("Nth Largest Number: ");
        int e = s.nextInt();
        int c=1;
        for(int x=0;x<p;x++){
            c*=10;
        }
        System.out.println(c-e);
    }
}
