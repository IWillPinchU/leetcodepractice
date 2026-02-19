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
        char[] arr = s.toCharArray();
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            if (i != arr.length - 1){
                if(romanMap.get(arr[i])==1 && romanMap.get(arr[i+1])==1){
                    temp++;
                    continue;
                }
                if(romanMap.get(arr[i])==5 && romanMap.get(arr[i+1])==1){
                    temp+=5;
                    continue;
                }
                if(romanMap.get(arr[i])< romanMap.get(arr[i+1])){
                    temp+=(romanMap.get(arr[i+1]) - romanMap.get(arr[i]));
                    ++i;
                    continue;
                }
            }
            answer+=romanMap.get(arr[i]);
        }
        return answer+temp;
    }
}