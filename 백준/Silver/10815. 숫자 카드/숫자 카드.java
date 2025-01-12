import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(sc.nextInt(), 0);
        }

        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0; i<m; i++) {
            int ma = sc.nextInt();
            if(map.get(ma)==null) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for(int i=0; i<m; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
