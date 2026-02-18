class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int ans = end;

        while (start<=end){
            int mid = start + (end - start)/2;
            if(canEat(piles,h,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return ans;
    }

    public boolean canEat(int[] piles,int h, int k){
        long hours_current = 0;
        for(int pile : piles){
            hours_current+=pile/k;
            if(pile % k != 0) hours_current++;
        }
        return hours_current<=h;
    }
}