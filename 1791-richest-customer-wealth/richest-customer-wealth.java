///My first way of thinking not optimized

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int counter = 0;
        for (int[] i: accounts){
            int money = 0;
            for(int j: i){
                money += j;
            }
            wealth[counter] = money;
            counter++;
        }
        int rich = wealth[0];
        for(int i = 1; i < wealth.length; i++){
            if (wealth[i] > rich) rich = wealth[i];
        }
        return rich;
    }
}