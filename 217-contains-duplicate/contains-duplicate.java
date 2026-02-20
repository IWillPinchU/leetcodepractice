class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> meowMap = new HashMap<>();
        for(int num:nums){
            if(meowMap.put(num,0) != null) return true;
        }
        return false;
    }
}