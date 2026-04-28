class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);
        int[] result = new int[k];
        
        for(int i = 0; i<mat.length; i++){
            pq.offer(new int[]{i, binarySearch(mat[i])});
            if(pq.size() > k) pq.poll();
        }

        while(k > 0) result[--k] = pq.poll()[0];

        return result;
    }

    public int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == 0) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}