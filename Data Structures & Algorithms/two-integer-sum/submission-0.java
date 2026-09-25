class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=nums.length-1;
        for(int i=0;i<=j;i++){
            for(int k=i+1;k<=j;k++){
                if(nums[i]+nums[k]==target){
                    return new int[] {i,k};
                }
            }
        }
        return new int[] {};
    }
}
