import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int start = 1;
        int floor = 1;

        while(floor < N) {
            floor += (start*6);
            start++;
        }
        
        System.out.println(start);

        sc.close();
    }
}