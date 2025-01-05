import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        String result = "";

        result = Integer.toString(n,b);
        
        System.out.println(result.toUpperCase());
        sc.close(); 

    }
}