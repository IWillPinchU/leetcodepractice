class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> meowMap = new HashMap<>();
        for(int num:nums){
            if(!meowMap.containsKey(num)) {
                meowMap.put(num,0);
            }
            else return true;
        }
        return false;
    }
}