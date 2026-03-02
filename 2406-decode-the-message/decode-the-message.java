class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        char curr = 'a';
        for(char c: key.toCharArray()){
            if (c == ' ') continue;
            if (map[c - 'a'] == 0){
                map[c - 'a'] = curr;
                curr++;
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