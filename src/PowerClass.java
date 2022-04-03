import java.math.BigInteger;
import java.util.Scanner;

public class PowerClass {
//    static int power(int n,int pow){
//
//        if(pow==0) return 1;
//
//        return n*power(n,pow-1);
//    }


    static BigInteger power(BigInteger n,BigInteger pow){

        if(pow.equals(BigInteger.ZERO)) return BigInteger.ONE;

        return n.multiply(power(n,pow.subtract(BigInteger.ONE)));
    }



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        BigInteger n = new BigInteger("2");
        BigInteger p = new BigInteger("2");
        System.out.println("Enter Value of N; ");
        n = s.nextBigInteger();
        System.out.println("Enter the power: ");
        p = s.nextBigInteger();

        System.out.println(n+"^"+p+"= "+power(n,p));
//        System.out.println("Enter Value of N; ");
//        int n = s.nextInt();
//        System.out.println("Enter Value of P; ");
//        int p = s.nextInt();
//        System.out.println(n+"^"+p+": "+ power(n,p));
    }
}
