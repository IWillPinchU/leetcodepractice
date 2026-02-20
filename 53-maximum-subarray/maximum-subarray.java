class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = -10001;
        int nextSum = 0;

        for(int i = 0; i<nums.length; i++){
            nextSum += nums[i];
            if (nextSum > currSum) currSum = nextSum;
            if (nextSum < 0) nextSum = 0;
        }

        return currSum;
    }
}