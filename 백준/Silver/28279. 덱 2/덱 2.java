import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deq = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1":
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    if(!deq.isEmpty()) {
                        sb.append(deq.removeFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "4":
                    if(!deq.isEmpty()) {
                        sb.append(deq.removeLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "5":
                    sb.append(deq.size()).append("\n");
                    break;
                case "6":
                    if(deq.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "7":
                    if(!deq.isEmpty()) {
                        sb.append(deq.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                    case "8":
                    if(!deq.isEmpty()) {
                        sb.append(deq.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
