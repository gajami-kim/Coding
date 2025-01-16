import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new LinkedList<>();
        
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    q.offer(x);
                    break;
                case "pop":
                    if(!q.isEmpty()) {
                        sb.append(q.poll()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(!q.isEmpty()) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
                case "front":
                    if(!q.isEmpty()) {
                        sb.append(q.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back":
                    if(!q.isEmpty()) {
                        if(q instanceof LinkedList) {
                            LinkedList<Integer> linkedList = (LinkedList<Integer>)q;
                            sb.append(linkedList.peekLast()).append("\n");
                        }
                    } else {
                        sb.append(-1).append("\n");
                    }
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
