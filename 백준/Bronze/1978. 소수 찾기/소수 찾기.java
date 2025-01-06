import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int count = 0;

        for(int i=0; i<N; i++) {
            boolean prime = true;

            int n = sc.nextInt();

            if(n==1) {
                continue;
            }
            for(int j=2; j<=Math.sqrt(n); j++) {
                if(n%j==0) {
                    prime = false;
                    break;
                }
            }
            if(prime) count++;
        }

        System.out.println(count);

        sc.close();
    }
}
