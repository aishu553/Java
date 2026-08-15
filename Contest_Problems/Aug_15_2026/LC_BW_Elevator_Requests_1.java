//given floor number requests, to move one floor to the nearest floor it takes 1 second. return the number of second took based on the requests

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] requests= {2,0,0};
        int pro=requests[0];
        for(int i=1;i<requests.length;i++){
            int move=Math.abs(requests[i-1]-requests[i]);
            pro=move+pro;
        }
        System.out.println(pro);
    }
}
