class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> meowMap = new HashMap<>();
        int i = 0;
        for(int num:nums){
            if(!meowMap.containsKey(num)) {
                meowMap.put(num,i);
                i++;
            }
            else return true;
        }
        return false;
    }
}