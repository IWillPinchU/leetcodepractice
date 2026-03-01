class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> check = new Stack<>();

        StringBuilder result = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(!check.isEmpty() && check.peek() == s.charAt(i)) check.pop();
            else check.push(s.charAt(i));
        }

        while(!check.isEmpty()) result.append(check.pop());
        return result.reverse().toString();
    }
}