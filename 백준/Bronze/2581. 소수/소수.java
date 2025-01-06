import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int index = -1;

        for(int i=N; i<=M; i++) {
            boolean prime = true;

            if(i==1) continue;

            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j==0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
                sum+=i;
                if(index==-1) {
                    index=i;
                }
            }
        }

        if(sum==0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(index);
        }

        sc.close();
    }
}
