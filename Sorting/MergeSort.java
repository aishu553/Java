//

import java.util.*;

public class Main{
  static void mergeSort(int[] arr,int low, int high){
    if(low>=high)return;
    int mid=(low+high)/2; // low + (high-low) /2 => for larger sized array 
    mergeSort(arr,low,mid);
    mergeSort(arr,mid+1,high);
    merge(arr,low,mid,high);
  }
  static void merge(int[] arr,int low,int mid,int high){
    int[] temp=new int[high-low+1];
    int left=low;
    int right=mid+1;
    int ind=0;
    while(left<=mid && right<=high){
      if(arr[left]<=arr[right])
        temp[ind++]=arr[left++];
      else
        temp[ind++]=arr[right++];
    }
    while(left<=mid)
      temp[ind++]=arr[left++];
    while(right<=high)
      temp[ind++]=arr[right++];
    ind=0;
    for(int i=low;i<=high;i++){
      arr[i]=temp[ind++];
    }
  }

    
  public static void main(String[] args){
    int[] arr={ 7, 3, 8, 2, 6, 4, 5};
    int n=arr.length;
    mergeSort(arr,0,n-1);
    for(int x:arr){
      System.out.print(x+" ");
    }
  }
}
