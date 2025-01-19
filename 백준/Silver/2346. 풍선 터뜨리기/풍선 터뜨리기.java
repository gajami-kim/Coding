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
        
        Deque<Integer> balloon = new ArrayDeque<>();
        Deque<Integer> paper = new ArrayDeque<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            balloon.add(i);
            paper.add(Integer.parseInt(st.nextToken())); //종이에 적힌 수수
        }

        while(!balloon.isEmpty()) {
            int number = balloon.pollFirst();
            int value = paper.pollFirst();

            //터진 풍선
            sb.append(number).append(" ");

            //모두 터지면 종료
            if(balloon.isEmpty()) break;

            if(value>0) {
                //오른쪽이동 (앞에서 뒤로)
                for (int i = 1; i < value; i++) {
                    balloon.addLast(balloon.pollFirst());
                    paper.addLast(paper.pollFirst());
                }
            } else {
                //왼쪽이동 (뒤에서 앞으로)
                for (int i = 0; i < Math.abs(value); i++) {
                    balloon.addFirst(balloon.pollLast());
                    paper.addFirst(paper.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}
