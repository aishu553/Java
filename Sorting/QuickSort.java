// "MOVES THE ELEMENTS THAT ARE SMALLER THAN PIVOT ELEMENT TO THE LEFT AND RECURSIVELY DIVIDE THE ARRAY INTO 2 PARTITIONS" - QUICK SORT

import java.util.*;

public class Main{
    static void quicksort(int[] arr, int start, int end){
        if(start>=end)return;
        int pivot=partition(arr, start,end);
        quicksort(arr,start,pivot-1);
        quicksort(arr,pivot+1,end);
    }
    static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
        
    }
    public static void main(String[] args){
        int[] arr={ 8, 2, 4, 7, 1, 3, 9, 6, 5};
        int end=arr.length;
        quicksort(arr,0,end-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
