import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<k; i++) {
            int value = Integer.parseInt(br.readLine());
            if(value!=0) {
                stack.push(value);
            } else if(!stack.empty()) {
                stack.pop();
            }
        }

        int sum = 0;
        for(int num : stack) {
            sum += num;
        }

        sb.append(sum);        
        System.out.println(sb);
    }
}
