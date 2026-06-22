class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        HashSet<Integer> elements = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            if(elements.contains(nums[i])) elements.remove(nums[i]);
            else elements.add(nums[i]);
        }

        return elements.iterator().next();
    }
}