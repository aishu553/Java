import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int sum=0;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<k;i++){
		    sum+=arr[i];
		    list.add(i+1);
		}
		int ans=sum;
		for(int i=k;i<n;i++){
		    sum+=arr[i];
		    sum-=arr[i-k];
		    if(sum>ans){
		        list.add(i+1);
		        list.remove(i-k+1);
		    }
		    ans=Math.max(ans,sum);
		}
		System.out.println(ans);
		System.out.println(list);

	}
}
