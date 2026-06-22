class Solution {
    public boolean check(int[] nums) {
        boolean fault = false;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                if (fault) return false;
                fault = true;
            }
        }
        return true;
    }
}