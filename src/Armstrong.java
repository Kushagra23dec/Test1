import java.util.Scanner;

public class Armstrong {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();

        Armstrong a = new Armstrong();

        for(int i = 1; i<=n; i++){

            boolean b = a.CheckArmstrong(i);
           if(b==true) System.out.println(i);
        }




    }

    public boolean CheckArmstrong(int n){


        int r,d=0,temp = n,x=1,c=0;

        while(temp>0){
            temp=temp/10;
            c++;
        }
        temp = n;

        while(n>0){

            r=n%10;
            n=n/10;

            for(int i=0;i<c;i++){
                x *=r;

            }

            d += x;
            x=1;

        }


        if(temp==d) return true;
        else return false;

    }
}
