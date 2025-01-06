import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        while(true) {
            int n = sc.nextInt();

            if(n==-1) break;

            int arr[] = new int[n];
            int sum = 0;
            int count = 0;

            for(int i=1; i<n; i++) {
                if(n%i==0) {
                    arr[count] = i;
                    count++;
                    sum+=i;
                }
            }

            if(n!=sum) {
                System.out.println(n+" is NOT perfect.");
            } else {
                System.out.print(n+" = ");
                for(int i=0; i<n; i++) {
                    if(n/2==arr[i]) {
                        System.out.println(arr[i]);
                    } else if(arr[i]!=0) {
                        System.out.print(arr[i]+" + ");
                    }
                }
            }
            
        }

        sc.close();
    }
}
