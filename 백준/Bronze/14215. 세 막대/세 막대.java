import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int line[] = {a,b,c};
        Arrays.sort(line);

        if(line[0]+line[1]>line[2]) {
            System.out.println(line[0]+line[1]+line[2]);
        } else {
            System.out.println((line[0] + line[1] - 1)+line[0] + line[1]);
        }

        sc.close();
    }
}
