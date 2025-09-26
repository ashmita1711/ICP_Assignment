// Sliding Window Maximum(Leetcode 239)


//Brute Force Approach

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =nums.length;
        int[] arr=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int maxNum=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                maxNum=Math.max(maxNum,nums[j]);
            }
            arr[i]=maxNum;
        }
        return arr;
    }
}


//Optimal Approach