class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();
        int m = part.length();
        for(char c:s.toCharArray()){
            result.append(c);
            if(result.length() >= m && result.substring(result.length() - m).equals(part)){
                result.delete(result.length() - m, result.length());
            }
        }
        
        return result.toString();
    }
}