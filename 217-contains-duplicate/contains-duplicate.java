class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dups = new HashMap<>();

        for(int num:nums){
            if(dups.containsKey(num)){
                return true;
            }
            else{
                dups.put(num, dups.getOrDefault(num, 0) + 1);
            }
        }

        return false;
    }
}