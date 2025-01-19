import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] queuestact = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queuestact[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int ele = Integer.parseInt(st.nextToken());
            if (queuestact[i] == 0) {
                deque.addLast(ele);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            int newElement = Integer.parseInt(st.nextToken());
            deque.addFirst(newElement);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}