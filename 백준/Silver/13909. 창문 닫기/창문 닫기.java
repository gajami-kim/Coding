import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        //제곱수를 이용해 열려있는 창문 개수 구함
        long result = (long)Math.sqrt(n);

        System.out.println(result);

        sc.close();
    }
    
}
