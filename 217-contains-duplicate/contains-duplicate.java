class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> meow = new HashSet<>();
        for(int num: nums){
            if(!meow.add(num)) return true;
        }
        return false;
    }
}