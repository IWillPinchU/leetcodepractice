class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = 0;

        for(; right<k; right++) max += nums[right];

        int nextMax = max;

        while(right<nums.length){
            nextMax -= nums[left];
            nextMax += nums[right];
            left++;
            right++;

            if(nextMax > max) max = nextMax;
        }

        return (double)max/k;
    }
}