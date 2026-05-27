class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int assignedCookies = 0;
        int childGreed = 0;
        int cookie = 0;
        
        while(cookie < s.length && childGreed < g.length){
            if(g[childGreed] <= s[cookie]){
                assignedCookies+=1;
                cookie++;
                childGreed++;
            }
            else{
                cookie++;
            }
        }
        
        return assignedCookies;
    }
}