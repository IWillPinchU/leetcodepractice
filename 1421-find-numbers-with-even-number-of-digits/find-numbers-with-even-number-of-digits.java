class Solution {
    public int findNumbers(int[] nums) {
        int numberOfEven = 0;
        for(int i : nums){
            int numberOfDigits = 0; 
            while (i>0){
                i=i/10;
                numberOfDigits++;
            }
            if (numberOfDigits % 2 == 0){
                numberOfEven++;
            }
        }
        return numberOfEven;
    }
}