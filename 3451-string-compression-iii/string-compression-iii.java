class Solution {
    public String compressedString(String word) {
        char[] string = word.toCharArray();
        char[] result = new char[2 * string.length];
        int count = 0;
        int idx = 0;
        char last = string[0];
        for(int i = 0; i<string.length; i++){
            if(count<9 && string[i] == last){
                count++;
                last = string[i];
                continue;
            }
            result[idx] = (char) ('0' + count);
            result[idx+1] = last;
            idx += 2;
            count = 1;
            last = string[i];
        }
        result[idx] = (char) ('0' + count);
        result[idx + 1] = last;
        idx+=2;
        return new String(result, 0, idx);
    }
}