import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> temp = new Stack<>();
        int[] wait = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) {
            wait[i] = Integer.parseInt(st.nextToken());
        }

        int current = 1;
        int index = 0;

        while(index < n || !temp.empty()) {
            //대기열에서 받을 수 있는 경우
            if(index<n && wait[index] == current) {
                index++;
                current++;
            } else if(!temp.empty() && temp.peek() == current) {
                //임시공간에서 받을 수 있는 경우
                temp.pop();
                current++;
            } else if(index < n) {
                //대기공간 -> 임시공간 이동
                temp.push(wait[index]);
                index++;
            } else {
                //이동 불가능
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
