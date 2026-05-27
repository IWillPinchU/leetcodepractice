class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollarBills = 0;
        int tenDollarBills = 0;
        int twentyDollarBills = 0;

        for(int bill: bills){
            if(bill == 5) fiveDollarBills++;
            else if(bill == 10){
                tenDollarBills++;
                if(fiveDollarBills > 0) fiveDollarBills -=1;
                else return false;
            }
            else{
                twentyDollarBills++;
                if(tenDollarBills > 0 && fiveDollarBills > 0){
                    tenDollarBills -= 1;
                    fiveDollarBills -= 1;
                }
                else if(fiveDollarBills >= 3){
                    fiveDollarBills -= 3;
                }
                else return false;
            }
        }
        
        return true;
    }
}