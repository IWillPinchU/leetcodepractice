class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] appearance = new boolean[26];
        int i = 97;
        for(char c: key.toCharArray()){
            if (c == ' ') continue;
            if (appearance[c - 'a'] != true){
                appearance[c - 'a'] = true;
                map[c - 'a'] = (char) i;
                i++;
            }
        }

        char[] result = new char[message.length()];
        int j = 0;
        for(char c: message.toCharArray()){
            result[j] = (c == ' ') ? ' ' : map[c - 'a'];
            j++;
        }

        return new String(result, 0, j);

    }
}