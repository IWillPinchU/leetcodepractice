class Solution {
    public int firstMissingPositive(int[] nums) {
        int  i = 1;

        Arrays.sort(nums);

        for(int num:nums){
            if(num > 0 && num == i){
                i++;
            }
        }
        return i;
    }
}