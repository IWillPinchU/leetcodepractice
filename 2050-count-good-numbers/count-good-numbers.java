class Solution {
    public int countGoodNumbers(long n) {
        long evenIndices = (n % 2 == 0) ? n/2 : n/2 + 1;
        long oddIndices = n/2;

        long evenStrings = binaryExp(5, evenIndices);
        long oddStrings = binaryExp(4, oddIndices);
        
        return (int)(evenStrings * oddStrings % 1000000007);
    }

    public long binaryExp(long x, long n){
        if(n==0) return 1;
        if(n%2==1) return (x * binaryExp(x*x % 1000000007, (n-1)/2)) % 1000000007;
        else return binaryExp(x*x % 1000000007, n/2);
    }
}