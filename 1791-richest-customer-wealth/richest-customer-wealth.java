class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] i: accounts){
            int money = 0;
            for(int j: i){
                money += j;
            }
            ans = (money >= ans) ? money : ans;
        }
        return ans;
    }
}