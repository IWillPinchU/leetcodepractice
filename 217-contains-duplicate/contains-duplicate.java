class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> meow = new HashSet<>();
        for(int num: nums){
            if(meow.contains(num)) return true;
            meow.add(num);
        }
        return false;
    }
}