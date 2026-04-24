class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        for(int num:nums){
            if(num == i){
                i++;
            }
            else if(num > i) return i;
        }
        return i;
    }
}