class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ltr = new int [nums.length];
        int [] rtl = new int [nums.length];
        int [] answer = new int [nums.length];

        for (int i =0;i<nums.length;i++){
            if (i ==0){
                ltr[i]=nums[i];
            }
            else{
                ltr[i]=ltr[i-1]*nums[i];
            }
        }

         for (int i =nums.length-1;i>-1;i--){
            if (i ==nums.length-1){
                rtl[i]=nums[i];
            }
            else{
                rtl[i]=rtl[i+1]*nums[i];
            }
        }

        
        for (int i =0;i<nums.length;i++){
            if(i==0)
             answer [i] = rtl[i+1];
            else if(i==nums.length-1)
             answer [i] = ltr[i-1];
            else answer[i] = ltr[i-1]*rtl[i+1];
        }


        return answer;
    }
}