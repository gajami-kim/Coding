import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<n; i++) {
            map.put(sc.next(), 0);
        }

        for(int i=0; i<m; i++) {
            String word = sc.next();
            if(map.get(word)!=null) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
