import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 1, nFac = 1, kFac = 1, nkFac = 1;

        for(int i=2; i<=n; i++) {
            nFac*=i;
        }
        for(int i=2; i<=k; i++) {
            kFac*=i;
        }

        for(int i=2; i<=(n-k); i++) {
            nkFac*=i;
        }
        result = nFac / (nkFac*kFac);
        
        System.out.println(result);
        sc.close();
    }
}