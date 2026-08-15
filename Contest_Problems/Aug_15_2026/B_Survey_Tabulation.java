================================== ATCODER ==================================
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) {
            String word=sc.next();
            word=word.toLowerCase();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        Map.Entry<String,Integer> max=Collections.max(
                map.entrySet(),
                Map.Entry.comparingByValue()
        );
        System.out.println(max.getValue());
    }
}

