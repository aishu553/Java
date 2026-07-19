import java.util.*;

public class Main{
  public static void main(String[] args){
    int[] arr={ 7, 3, 8, 2, 6, 4, 5};
    int n=arr.length;
    for(int i=1;i<n;i++){
      int j=i;
      while(j>0 && arr[j-1]>arr[j]){
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
      }
    }
    for(int x:arr){
      System.out.print(x+" ");
    }
  }
}
