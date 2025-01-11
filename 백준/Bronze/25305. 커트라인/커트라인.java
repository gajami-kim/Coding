import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        Integer x[] = new Integer[N];

        for(int i=0; i<N; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x, Collections.reverseOrder());

        System.out.println(x[k-1]);

        sc.close();
    }
    
}
