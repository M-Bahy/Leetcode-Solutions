/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    k -= (   Math.floor(k/nums.length)       *    nums.length    );
    if(k > 0){
        let left = nums.slice(nums.length - k,nums.length);
        let right = nums.slice(0,nums.length - k);
        rotated = left.concat(right);

        for(let i =0;i<nums.length;i++){
            nums[i] = rotated[i];
        }
    }
};