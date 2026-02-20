class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while(i<=j){
            if (nums[i] == nums[j] && nums[j] == val){
                j--;
                continue;
            }
            else if(nums[i]!=nums[j] && nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else if(nums[i]!=val){
                i++;
            }
        }

        return j+1;
    }
}