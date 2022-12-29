import java.util.Scanner;

public class power {
    static int pow2(int p, int q){
        // base case
        if (q==0){
            return 1;
        }

        // smallProblem - recursive work
        int smallProb= pow2(p,q/2);
        if (q%2==0){
            return smallProb*smallProb;
        }

        return smallProb * smallProb * p;
    }
    static int pow1(int p,int q){
        // base case
        if (q==0){
            return 1;
        }

        // smallProblem - recursive work
        int smallProm= pow1(p,q-1);

        // self work
        int ans = smallProm*p;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
//        System.out.println(pow1(p,q));
        System.out.println(pow2(p,q));
    }
}
