class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        genParenthesis(n, n, results, new StringBuilder());
        return results;
    }

    public void genParenthesis(int open, int closed, List<String> results, StringBuilder sb){
        if(open == 0 && closed == 0){
            results.add(sb.toString());
            return;
        }
        if(open > 0){
            sb.append("(");
            genParenthesis(open-1, closed, results, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open<closed){
            sb.append(")");
            genParenthesis(open, closed-1, results, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}