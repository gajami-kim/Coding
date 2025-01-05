import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int dis = (V-B) / (A-B);

        if((V-B) % (A-B)!=0) dis++;
        System.out.println(dis);

        sc.close();
    }
}