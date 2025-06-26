class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> found = new HashSet<Integer>();
        for (int n : nums){
            if (found.contains(n))
                return n;
            found.add(n);
        }
        return 0;
    }
}