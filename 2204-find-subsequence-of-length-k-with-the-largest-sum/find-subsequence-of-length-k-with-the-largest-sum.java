class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> nums[a] - nums[b]);

        for(int i = 0; i < nums.length; i++){
            pq.offer(i);
            if(pq.size() > k) pq.poll();
        }

        int[] indexes = new int[k];
        for(int i = 0; i<k; i++) indexes[i] = pq.poll();

        Arrays.sort(indexes);

        for(int i = 0; i<k; i++){
            indexes[i] = nums[indexes[i]];
        }
        
        return indexes;
    }
}