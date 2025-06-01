class Solution {
    public int findNumbers(int[] nums) {
        int numberOfEven = 0;
        for(int i : nums){
            numberOfEven += (int)Math.log10(i) & 1;
            }
        return numberOfEven;
    }
}