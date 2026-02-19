class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int answer = 0;
        for(int i = 0; i<s.length() - 1; ++i){
            if(romanMap.get(s.charAt(i))< romanMap.get(s.charAt(i+1))){
                answer -= romanMap.get(s.charAt(i));
                continue;
            }
            else{
                answer+=romanMap.get(s.charAt(i));
            }
        }
        return answer + romanMap.get(s.charAt(s.length() - 1));
    }
}