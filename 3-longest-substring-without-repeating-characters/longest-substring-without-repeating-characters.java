class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        if(s.length() == 1) return 1;
        int maxLength = 0;
        int[] occured = new int[128];

        for(int right = 0, left = 0; right < s.length(); right++){
            while(occured[s.charAt(right)] == 1){
                occured[s.charAt(left)] = 0;
                left++;
            }
            occured[s.charAt(right)] = 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}