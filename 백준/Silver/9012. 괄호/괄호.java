import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++) {
            String str = br.readLine();
            if(isVPS(str)) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isVPS(String str) {
        Stack<Character> stack = new Stack<>();

        for(int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);

            if(ch=='(') {
                stack.push(ch); //여는 괄호 추가
            } else if(ch==')') {
                if(stack.isEmpty()) {
                    return false; //닫는괄호가 여는괄호보다 많으면 NO
                }
                stack.pop(); //여는괄호와 매칭되는 닫는괄호 제거거
            }
        }

        return stack.isEmpty(); //stack이 비어있으면 YES, 아니면 NO
    }
}
