class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Pair<Character,Integer>> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().getKey() == c){
                Pair<Character,Integer> pair = stack.pop();
                pair = new Pair<>(pair.getKey(), pair.getValue() + 1);

                if(pair.getValue() < k) stack.push(pair);
            }
            else stack.push(new Pair<>(c, 1));
        }

        for(Pair<Character, Integer> pear: stack){
            for(int i = 0; i< pear.getValue(); i++) sb.append(pear.getKey());
        }
        return sb.toString();
    }
}