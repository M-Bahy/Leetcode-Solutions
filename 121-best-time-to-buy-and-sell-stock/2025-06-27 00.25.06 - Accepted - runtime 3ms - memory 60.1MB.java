class Solution {
    public int maxProfit(int[] prices) {
        Integer lowestSoFar = Integer.MAX_VALUE;
        Integer diff = Integer.MIN_VALUE;
        for (int num : prices){
            if (num < lowestSoFar)
                lowestSoFar=num;
            if(num - lowestSoFar > diff)
                diff = num-lowestSoFar ;   
        }
        return diff;
    }
}