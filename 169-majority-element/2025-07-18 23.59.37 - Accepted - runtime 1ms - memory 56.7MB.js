var majorityElement = function(nums) {
    let target = Math.floor(nums.length / 2);
    let countMap = {};

    for (let i = 0; i < nums.length; i++) {
        let val = nums[i];
        countMap[val] = (countMap[val] || 0) + 1;
    }


    let maxKey = null;
    let maxCount = 0;

    for (let key in countMap) {
        if (countMap[key] > maxCount) {
            maxCount = countMap[key];
            maxKey = key;
        }
    }

    return Number(maxKey);

};
