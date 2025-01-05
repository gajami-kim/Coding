import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;
        
        for(int i=0; i<T; i++) {
            int C = sc.nextInt();

            q = C/25;
            C = C%25;

            d = C/10;
            C = C%10;

            n = C/5;
            C = C%5;

            p = C/1;

            System.out.println(q+" "+d+" "+n+" "+p);
        }


        sc.close();
    }
}