class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        if (nums[0] < nums[nums.length-1]){
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<min)
                    min = nums[i];
                if(nums[i]>min)
                    return min;
            }   
        }
        else{
            for(int i = nums.length-1;i>-1;i--){
                if(nums[i]<min)
                    min = nums[i];
                if(nums[i]>min)
                    return min;
            }   
        }
        return min;
    }
}