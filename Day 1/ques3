// Find First and Last Position of Element in Sorted Array(Leetcode 34)

//Brute Force Approach

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=-1;
        int right=-1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                if(left==-1){
                    left=i;
                }
                right=i;
            }
        }
        return new int[]{left,right};
    }
}


//Optimal Approach

class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[]{first,last};
    }
    private int findFirst(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            if(nums[mid]==target){
                ans=mid;
            }
            
        }
        return ans;
    }
        private int findLast(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            if(nums[mid]==target){
                ans=mid;
        }}
        return ans;
        }
}