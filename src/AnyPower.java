import java.math.BigInteger;
import java.util.Scanner;

public class AnyPower {

    public static void main(String[] args) {
        BigInteger n,p,holder,pHolder;
        Boolean flag=true;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter N;");
        n = s.nextBigInteger();
        System.out.println("Enter Power: ");
        p = s.nextBigInteger();
        holder = n;
        pHolder = p;

        while(flag){

             holder = holder.multiply(n);
             p =  p.subtract(BigInteger.ONE);
            if(p.equals(BigInteger.ONE)) flag = false;

            System.out.println("holder: "+holder);
        }
        System.out.println(n+"^"+pHolder+"= "+holder);
    }

}
