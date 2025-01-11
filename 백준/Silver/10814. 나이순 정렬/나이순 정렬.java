import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer, List<String>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            // 나이가 key가 되고, 같은 나이에 여러 명이 있을 수 있도록 List에 이름 추가
            map.computeIfAbsent(age, k -> new ArrayList<>()).add(name);
        }

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            for (String name : entry.getValue()) {
                System.out.println(entry.getKey() + " " + name);
            }
        }

        br.close();
    }
}
