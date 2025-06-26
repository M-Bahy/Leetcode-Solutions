class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int [] ltr = new int [nums.length];
        // int [] rtl = new int [nums.length];
        int [] answer = new int [nums.length];
        int val = 1;
        for (int i =0;i<nums.length;i++){
            if (i ==0){
                answer[i]=nums[i];
            }
            else{
                answer[i]=answer[i-1]*nums[i];
            }
        }

         for (int i =nums.length-1;i>0;i--){
            answer[i] = answer[i-1] * val;
            val *= nums[i];
            if (i==1)
                answer[0] = val;
        }

        
        

        return answer;
    }
}