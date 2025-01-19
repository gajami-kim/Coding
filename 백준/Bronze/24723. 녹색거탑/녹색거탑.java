import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        //2의 제곱수
        System.out.println((int)Math.pow(2, n));
        
        sc.close();
    }
}