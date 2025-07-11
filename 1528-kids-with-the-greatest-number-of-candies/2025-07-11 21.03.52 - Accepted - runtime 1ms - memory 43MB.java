class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList();
        int maxKid = candies[0];
        for(int candy : candies){
            if(candy > maxKid)
                maxKid = candy;
        }
        for(int i =0;i<candies.length;i++){
            if(candies[i] == maxKid || (     (candies[i]+extraCandies)    >= maxKid               )){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}