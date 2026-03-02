class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int i = s.indexOf(part);
            String firstP = s.substring(0,i);
            String secondP = s.substring(i+part.length(), s.length());
            
            s = firstP + secondP;
        }
        
        return s;
    }
}