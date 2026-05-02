class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] set = new int[nums.length][2];

        for(int i = 0; i < nums.length; i++){
            set[i][0] = nums[i];
            set[i][1] = i;
        }

        Arrays.sort(set, (a,b) -> b[0] - a[0]);
        Arrays.sort(set, 0, k, (a,b) -> a[1] - b[1]);

        int[] result = new int[k];
        for(int i = 0; i<k; i++) result[i] = set[i][0];
 
        return result;
    }
}