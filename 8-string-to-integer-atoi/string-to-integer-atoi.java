class Solution {
    public int myAtoi(String s) {
        char[] stringy = s.toCharArray();
        long result = 0;
        int i = 0;
        int flag = 1;
        if(s.length() == 0) return 0;
        for(; i<stringy.length; i++){
            if(stringy[i] == ' ') continue;
            else break;
        }
        if(i < s.length() && (stringy[i] == '-' || stringy[i] == '+')){
            if (stringy[i] == '-') flag = -1;
            i++;
        }
        for(;i<stringy.length;i++){
            if(Character.isDigit(stringy[i])){
                result = result * 10 + stringy[i] - '0';
                if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                    if (flag == -1) return Integer.MIN_VALUE;
                    else return Integer.MAX_VALUE;
                }
            }
            else break;
        }
        return (int)result * flag;
    }
}