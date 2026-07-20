import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static void insertion_sort(int[] arr,int n){
		for(int i=0;i<n;i++){
		    int j=i;
		    while(j>0 && arr[j-1]>arr[j]){
		        int temp=arr[j-1];
		        arr[j-1]=arr[j];
		        arr[j]=temp;
		        j--;
		    }
		}
    }
    
    static void mergesort(int[] arr, int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low, int mid, int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int ind=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[ind++]=arr[left++];
            }
            else{
                temp[ind++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[ind++]=arr[left++];
        }
        while(right<=high){
            temp[ind++]=arr[right++];
        }
        ind=0;
        for(int i=low;i<=high;i++){
            arr[i]=temp[ind++];
        }
    }
    
    static void quicksort(int[] arr,int start,int end){
        if(start>=end)return;
        int pivot=partition(arr,start,end);
        quicksort(arr,start,pivot-1);
        quicksort(arr,pivot+1,end);
    }
    
    static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={ 8, 5 ,7, 3,9,1,4,6};
		int n=8;
		//mergesort(arr,0,n-1);
		quicksort(arr,0,n-1);
		for(int x:arr)
		    System.out.print(x+" ");
	}
}
