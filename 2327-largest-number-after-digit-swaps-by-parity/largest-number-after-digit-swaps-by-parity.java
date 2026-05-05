class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> evenNums = new PriorityQueue<>( (a,b) -> b - a);
        PriorityQueue<Integer> oddNums = new PriorityQueue<>( (a,b) -> b - a);
    
        int[] arr = new int[10];
        int i = 0;
        //1 for odd and 2 for even
        while(num > 0){
            int temp = num % 10;
            num = num/10;
            if(temp%2 == 0){
                evenNums.add(temp);
                arr[i++] = 2;
            }
            else{
                oddNums.add(temp);
                arr[i++] = 1;
            }
        }

        int sum = 0;

        for(int k = i - 1; k>=0; k--){
            if(arr[k] == 1){
                sum = sum*10 + oddNums.poll();
            }
            else sum = sum*10 + evenNums.poll();
        }

        return sum;
    }
}