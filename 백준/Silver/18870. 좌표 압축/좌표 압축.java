import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ori[] = new int[n];
        int sort[] = new int[n];

        for(int i=0; i<n; i++) {
            ori[i] = sort[i] = sc.nextInt();
        }

        Arrays.sort(sort);

        HashMap<Integer,Integer> map = new HashMap<>();

        int x = 0;
        for(int k : sort) {
            //좌표가 중복되지 않은 경우에만 map에 추가
            if(!map.containsKey(k)) {
                map.put(k,x);
                x++; 
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : ori) {
            int xi = map.get(key);
            sb.append(xi).append(" ");
        }
        System.out.println(sb);

        sc.close();
    }
}
