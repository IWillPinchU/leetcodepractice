class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int num:nums){
            newMap.put(num,newMap.getOrDefault(num,0)+1);
            if (newMap.get(num) > nums.length/2) return num;
        }
        return Collections.max(newMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}