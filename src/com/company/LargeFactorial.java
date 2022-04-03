package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        BigInteger n,p,holder,pHolder;
        Scanner s = new Scanner(System.in);
        Boolean flag = true;
        System.out.println("Enter N;");
        n = s.nextBigInteger();
        p = n;
        holder = n;
        pHolder = n;
if(n.equals(BigInteger.ZERO)) {
    holder = BigInteger.ONE;
    flag = false;
}
        while(flag){

            n = n.subtract(BigInteger.ONE);
            p = n;

            holder = holder.multiply(p);

            if(p.equals(BigInteger.ONE)) flag=false;

        }
        System.out.println(pHolder+"!= "+holder);

    }
}
