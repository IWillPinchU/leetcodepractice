class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dups = new HashSet<>();

        for(int num:nums){
            if(dups.contains(num)){
                return true;
            }
            else{
                dups.add(num);
            }
        }

        return false;
    }
}