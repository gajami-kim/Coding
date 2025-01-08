import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();
    
        for(int i=0; i<3; i++) {
            xList.add(sc.nextInt());
            yList.add(sc.nextInt());
        }

        int x = (xList.get(0).equals(xList.get(1))) ? xList.get(2) :
                (xList.get(0).equals(xList.get(2))) ? xList.get(1) : xList.get(0);

        int y = (yList.get(0).equals(yList.get(1))) ? yList.get(2) :
                (yList.get(0).equals(yList.get(2))) ? yList.get(1) : yList.get(0);

        System.out.println(x+" "+y);

        sc.close();
    }
}
