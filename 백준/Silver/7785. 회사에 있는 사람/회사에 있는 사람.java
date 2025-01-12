import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        //Comparator를 이용해서 내림차순으로 TreeMap 생성
        TreeMap<String, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            map.computeIfAbsent(name, k -> new ArrayList<>()).add(state);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> state = entry.getValue();
            //마지막 상태를 확인하기위해 size-1을 함
            String lastState = state.get(state.size()-1);
            
            if(lastState.equals("enter")) {
                sb.append(entry.getKey()).append("\n");
            }
        }

        System.out.println(sb);
        
    }
}
