class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') check.push(c);
            else{
                if (check.isEmpty()) return false;
                char top = check.pop();

                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) return false;
            }
        }
        return check.isEmpty();
    }
}