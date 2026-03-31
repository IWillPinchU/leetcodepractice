class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        genParenthesis(n, n, results, "");
        return results;
    }

    public void genParenthesis(int open, int closed, List<String> results, String s){
        if(open == 0 && closed == 0){
            results.add(s);
            return;
        }
        if(open > 0) genParenthesis(open-1, closed, results, s + "(");
        if(open<closed) genParenthesis(open, closed-1, results, s + ")");
    }
}