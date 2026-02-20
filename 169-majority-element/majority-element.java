class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int num:nums){
            if (newMap.containsKey(num)){
                newMap.put(num,newMap.getOrDefault(num,0)+1);
            }
            else newMap.put(num,0);
        }
        return Collections.max(newMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}