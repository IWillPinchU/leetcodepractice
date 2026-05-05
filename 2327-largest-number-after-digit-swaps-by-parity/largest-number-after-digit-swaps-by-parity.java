class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> evenNums = new PriorityQueue<>( (a,b) -> b - a);
        PriorityQueue<Integer> oddNums = new PriorityQueue<>( (a,b) -> b - a);
        int n = num;

        while(n > 0){
            int r = n % 10;
            n = n/10;
            if(r%2 == 0) evenNums.offer(r);
            else oddNums.offer(r);
        }

        String s = String.valueOf(num);
        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            sum *= 10;
            if((s.charAt(i) - '0') % 2 == 0){
                sum += evenNums.poll();
            }
            else sum += oddNums.poll();
        }

        return sum;
    }
}