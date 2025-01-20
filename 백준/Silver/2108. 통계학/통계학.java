import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        sb.append(calcAvg(arr)).append("\n");
        sb.append(calcMiddle(arr)).append("\n");
        sb.append(calcMost(arr)).append("\n");
        sb.append(calcRange(arr)).append("\n");

        System.out.println(sb);
    }

    //산술평균
    public static int calcAvg(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (int) Math.round((double) sum / arr.length);
    }
    
    //중앙값
    public static int calcMiddle(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
    
    //최빈값
    public static int calcMost(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    
        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list.size() > 1 ? list.get(1) : list.get(0);
    }
    
    //범위
    public static int calcRange(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}