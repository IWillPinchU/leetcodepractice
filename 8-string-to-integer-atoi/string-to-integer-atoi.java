class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;

        char[] stringy = s.toCharArray();
        int i = 0;
        int flag = 1;
        for(; i<stringy.length; i++){
            if(stringy[i] == ' ') continue;
            else break;
        }

        if(i < s.length() && (stringy[i] == '-' || stringy[i] == '+')){
            if (stringy[i] == '-') flag = -1;
            i++;
        }

        return (int)myAtoiRec(stringy, i, flag, 0);
    }

    public long myAtoiRec(char[] stringy, int i, int flag, long numberSoFar){
        if(i == stringy.length || !Character.isDigit(stringy[i])) return numberSoFar * flag;

        numberSoFar = numberSoFar * 10 + stringy[i] - '0';

        if(numberSoFar > Integer.MAX_VALUE){
            if (flag == -1) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }

        return myAtoiRec(stringy, ++i, flag, numberSoFar);
    }
}