class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        Set<Character> open = Set.of('(','{','[');
        for(int i=0; i<s.length(); i++){
            if(open.contains(s.charAt(i))) check.push(s.charAt(i));
            else if(check.isEmpty()) return false;
            else if((s.charAt(i) == ')' && check.peek() == '(')
            || (s.charAt(i) == '}' && check.peek() == '{') ||
            (s.charAt(i) == ']' && check.peek() == '[')) check.pop();
            else return false;
        }
        if (check.isEmpty()) return true;
        return false;
    }
}