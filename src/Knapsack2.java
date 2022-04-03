import java.util.Arrays;

public class Knapsack2 {

    static int[][] t = new int[5][9] ;


    Knapsack2() {

        Arrays.fill(t,-1);

    }

   public int knapsack(int[] wt, int[] val, int W, int n){

        // Base condition
        if(n==0|| W==0){
            return 0;
        }

        if(t[n][W] !=-1) return t[n][W];


        if(wt[n-1] <= W){
            return t[n][W] = Math.max(knapsack(wt,val,W-wt[n-1],n-1),
                    knapsack(wt,val,W,n-1));
        }

        else if(wt[n-1] > W)
            return t[n][W] =  knapsack(wt,val,W,n-1);

        return 0;
    }


    public static void main(String[] args) {

        int[] val = {1,3,5,6};
        int[] wt = {2,3,6,7};
        int W = 8;
        int n = val.length;

        Knapsack2 k = new Knapsack2();


        System.out.println(k.knapsack(wt,val,W,n));



    }


}
