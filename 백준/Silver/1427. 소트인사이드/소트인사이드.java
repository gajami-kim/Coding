import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        char[] arr = new char[n.length()];

        for(int i=0; i<n.length(); i++) {
            arr[i] = n.charAt(i);
        }

        Arrays.sort(arr);
        StringBuilder br = new StringBuilder(new String(arr));
        String res = br.reverse().toString();

        System.out.println(res);
    
        sc.close();
    }
    
}
