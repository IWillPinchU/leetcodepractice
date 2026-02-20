class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = nums[0];
        int a = 1;
        for(int i = 1; i<nums.length; i++){
            if (unique != nums[i]){
                unique = nums[i];
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}