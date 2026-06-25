class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int tracker = 0;
        for(int i:nums){
            if(tracker == i) tracker++;
            else return tracker;
        }
        return tracker;
    }
}