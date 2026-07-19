//"PUSH THE MAXIMUM ELEMENT TO THE LAST BY ADJACENT SWAPS" - BUBBLE SORT

import java.util.*;

public class Main{
  public static void main(String[] args){
    int[] arr={ 7, 3, 8, 2, 6, 4, 5};
    int n=arr.length;
    for(int i=n-1;i>=0;i--){
      int didSwap=0;
      for(int j=0;j<i-1;j++){
        if(arr[j]>arr[j+1]){
          didSwap=1;
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
      if(didSwap==0) break;
    }
    for(int x:arr)
      System.out.print(x+" ");
  }
}
