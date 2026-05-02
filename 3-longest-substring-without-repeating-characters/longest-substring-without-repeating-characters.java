class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashSet<Character> occured = new HashSet<>();

        for(int right = 0; right < s.length(); right++){
            while(occured.contains(s.charAt(right))){
                occured.remove(s.charAt(left));
                left++;
            }
            occured.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}