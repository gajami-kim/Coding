import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] xList = new int[N];
        int[] yList = new int[N];

        for(int i=0; i<N; i++) {
            xList[i] = sc.nextInt();
            yList[i] = sc.nextInt();
        }

        Arrays.sort(xList);
        Arrays.sort(yList);

        System.out.println((xList[N-1] - xList[0]) * (yList[N-1] - yList[0]));

        sc.close();
    }
}
