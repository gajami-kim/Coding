import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fac = 1;
        for(int i=2; i<=n; i++) {
            fac*=i;
        }
        
        System.out.println(fac);
        sc.close();
    }
}