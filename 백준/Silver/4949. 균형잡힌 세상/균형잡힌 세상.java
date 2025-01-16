import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();

            if(str.equals(".")) break;

            //괄호 제외 삭제함
            String result = str.replaceAll("[^()\\[\\]]", "");
            if(isVPS(result)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isVPS(String str) {
        Stack<Character> stack = new Stack<>();

        for(int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);

            if(ch=='(' || ch=='[') {
                stack.push(ch); //여는 괄호 추가
            } else if(ch==')' || ch==']') {
                if(stack.isEmpty()) {
                    return false; //닫는괄호가 여는괄호보다 많으면 NO
                }
               
                char top = stack.pop(); //가장 위에 있는 여는 괄호 꺼냄
                if((ch==')' && top !='(') || (ch==']' && top !='[') ) {
                    return false; //같은 종류의 괄호가 매칭되지 않음
                }
            }
        }

        //괄호 종류가 같고 짝을 이룬다면
        return stack.isEmpty();
    }
}
