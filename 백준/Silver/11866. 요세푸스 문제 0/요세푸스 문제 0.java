import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            q.add(i);
        }

        sb.append("<");
        while(q.size()!=1) {
            for(int i=0; i<k-1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        //마지막값
        sb.append(q.poll()).append(">");
        
        System.out.println(sb);
    }
}
