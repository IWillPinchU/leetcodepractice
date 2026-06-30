class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(newMap.containsKey(complement)){
                return new int[]{i, newMap.get(complement)};
            }
            newMap.put(nums[i], i);
        }
        
        return null;
    }
}