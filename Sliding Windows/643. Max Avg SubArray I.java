class Solution {
    static double ave(int sum,int k){
        double a=(double)sum/k;
        return a;
    }
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double a=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        a=(double)sum/k;
        double avg=a;
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            a=ave(sum,k);
            avg=Math.max(a,avg);
        }
        return avg;
    }
}
