class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();

        for(char c:s.toCharArray()){
            result.append(c);
            if(result.length() >= part.length() && result.substring(result.length() - part.length()).equals(part)){
                result.delete(result.length() - part.length(), result.length());
            }
        }
        
        return result.toString();
    }
}