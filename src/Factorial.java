import java.util.ArrayList;
import java.util.List;

public class Factorial {

    private static List<Long> memo = new ArrayList<>();

    static long fact(int i){
        long total = 0;
        if(i==0){
            return 1;
        }
        else if(memo.size()>=i){
            return memo.get(i-1);
        }

            total =  i*fact(i-1);
        memo.add(total);
            return total;


    }



    public static void main(String[] args) {

        System.out.println(fact(12));
    }
}
