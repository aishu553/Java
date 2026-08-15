================================== ATCODER ==================================
//Failed at the first try coz i did "nine" and "nein" instead of "Nine" and "Nein"
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a+b==9){
            System.out.println("Nine");
        }
        else if(a-b==9){
            System.out.println("Nine");
        }
        else if(a*b==9){
            System.out.println("Nine");
        }
        else if( (double)a/b ==9.00){
            System.out.println("Nine");
        }
        else{
            System.out.println("Nein");
        }
    }
}
