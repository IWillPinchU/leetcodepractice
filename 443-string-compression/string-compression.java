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
            }
            else{
                if(count == 1){
                    chars[idx++] = last;
                    count = 1;
                    last = c;
                }
                else{
                    chars[idx++] = last;
                    String counter = Integer.toString(count);
                    for(char c2:counter.toCharArray()){
                        chars[idx++] = c2;
                    }
                    count = 1;
                    last = c;
                }
            }
        }
        if(count == 1){
            chars[idx++] = last;
        }
        else{
            chars[idx++] = last;
            String counter = Integer.toString(count);
            for(char c:counter.toCharArray()){
                chars[idx++] = c;
            }
        }
        return idx;
    }
}