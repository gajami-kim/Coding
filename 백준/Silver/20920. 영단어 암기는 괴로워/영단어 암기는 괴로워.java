import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++) {
            String word = br.readLine();
            if(word.length()>=M) {
                if(map.get(word)!=null) {
                    map.put(word,map.get(word)+1);
                } else {
                    map.put(word,1);
                }
            }
        }

        //출력용 새로운 list
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        Comparator<Map.Entry<String, Integer>> comparator = (e1, e2) -> {
            int most = e2.getValue() - e1.getValue(); // 빈도순 정렬
            int length = e2.getKey().length() - e1.getKey().length(); //길이순 정렬
            if (most != 0) {
                return most;
            } else if(length!=0){
                return length;
            } else {
                return e1.getKey().compareTo(e2.getKey()); //알파벳순 정렬
            }
        };

        // entries 리스트를 복합 Comparator를 이용하여 정렬
        entries.sort(comparator);


        for (Map.Entry<String, Integer> entry : entries) {
            bw.write(entry.getKey()+"\n");
        }

        bw.flush();
        bw.close();
    }

    
}