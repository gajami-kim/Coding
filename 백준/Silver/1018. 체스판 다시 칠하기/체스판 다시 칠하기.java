import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char chess[][] = new char[N][M];

        for(int i=0; i<N; i++) {
            String line = sc.nextLine();
            for(int j=0; j<M; j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<=N-8; i++) {
            for(int j=0; j<=M-8; j++) {
                min = Math.min(min, calcBoard(chess, i, j));
            }
        }

        System.out.println(min);
        sc.close();
    }

    private static int calcBoard(char[][] board, int x, int y) {
        int s1 = 0; //'W'
        int s2 = 0; //'B'

        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                //현재 칸의 색
                char c1 = ((i+j) % 2 == 0) ? 'W' : 'B';
                char c2 = ((i+j) % 2 == 0) ? 'B' : 'W';

                if(board[x+i][y+j] != c1) s1++;
                if(board[x+i][y+j] != c2) s2++;
            }
        }

        return Math.min(s1, s2);
    }
    
}
