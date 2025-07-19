/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i = 0;
    let j = 1;
    let allow = true;
    while(j <= nums.length-1){
        if(nums[i] != nums[j]){
            nums[i+1]=nums[j];
            i++;
            allow = true;
        }
        else{
            if(allow){
                allow = false;
                nums[i+1]=nums[j];
                i++;
            }
        }
        j++;
    }
    return i+1;
};