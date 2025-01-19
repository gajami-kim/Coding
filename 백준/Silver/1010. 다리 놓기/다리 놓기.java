import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            long result = combination(N, M);
            System.out.println(result);
        }

        sc.close();
    }

    public static long combination(int n, int m) {
        long result = 1;
        for(int i=0; i<n; i++) {
            result *= (m-i);
            result /= (i+1);
        }

        return result;
    }
}