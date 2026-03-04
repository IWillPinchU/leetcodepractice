class Solution {
    public String compressedString(String word) {
        char[] string = word.toCharArray();
        char[] result = new char[2 * string.length];
        int idx = 0;
        char last = string[0];
        int count = 1;
        for(int i = 1; i<string.length; i++){
            if(count<9 && string[i] == last){
                count++;
            }
            else{
                result[idx++] = (char) ('0' + count);
                result[idx++] = last;
                count = 1;
                last = string[i];
            }
        }
        result[idx++] = (char) ('0' + count);
        result[idx++] = last;
        return new String(result, 0, idx);
    }
}