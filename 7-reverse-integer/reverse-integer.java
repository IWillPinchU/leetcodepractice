class Solution {
    public int reverse(int x) {
        int reverse = 0;
        boolean negative = (x<0) ? true:false;
        x = Math.abs(x);
        long sum = 0;

        while(x!=0){
            int remainder = x%10;
            sum = (sum * 10) + remainder;
            x = x/10;
        }
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;
        sum *= negative ? -1 : 1;
        return (int)sum;
    }
}