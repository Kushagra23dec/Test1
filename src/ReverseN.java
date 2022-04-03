import java.util.Scanner;

public class ReverseN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d=0,t=0;
        for(int i=n;i>0;i/=10){
           t =  i%10;

            d=(d*10)+t;
        }
        System.out.println("Reverse of "+n+" is : "+ d);
    }
}
