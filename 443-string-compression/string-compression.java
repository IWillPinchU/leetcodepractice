class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int idx = 0;
        char last = chars[0];
        int count = 1;
        for(int i = 1; i<chars.length; i++){
            char c = chars[i];
            if(c == last){
                count++;
                continue;
            }
            chars[idx++] = last;
            if(count != 1){
                String counter = Integer.toString(count);
                for(int j=0; j<counter.length(); j++){
                    chars[idx++] = counter.charAt(j);
                }
            }
            count = 1;
            last = c;
        }
        chars[idx++] = last;
        if(count != 1){
            String counter = Integer.toString(count);
            for(int i=0; i<counter.length(); i++){
                chars[idx++] = counter.charAt(i);
            }
        }
        return idx;
    }
}