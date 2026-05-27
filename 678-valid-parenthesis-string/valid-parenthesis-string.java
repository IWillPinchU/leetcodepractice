class Solution {
    public boolean checkValidString(String s) {
        char[] stringy = s.toCharArray();
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*') star.push(i);
            else if(s.charAt(i) == '(') open.push(i);
            else{
                if(!open.isEmpty()) open.pop();
                else if(!star.isEmpty() && star.peek() < i) star.pop();
                else return false;
            }
        }
        
        while(!open.isEmpty() && !star.isEmpty()){
            if(open.peek() < star.peek()){
                open.pop();
                star.pop();
            }
            else return false;
        }
        return open.isEmpty();
    }
}