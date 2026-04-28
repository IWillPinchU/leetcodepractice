class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] strength = new int[mat.length][2];
        int  i = 0;
        for(int[] row: mat){
            strength[i][0] = i;
            strength[i][1] = binarySearch(row);
            i++;
        }
        Arrays.sort(strength, (a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int[] results = new int[k];
        for (i = 0; i < k; i++)
            results[i] = strength[i][0];
        return results;
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