class Solution {
    public int maximumCount(int[] nums) {
        int firstZero = binarySearchFirstZero(nums);
        int lastZero = binarySearchLastZero(nums);

        int positive_int = nums.length - 1 - lastZero;
        int negative_int = firstZero;

        if (positive_int >= negative_int) return positive_int;
        return negative_int;

    }

    public int binarySearchLastZero(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= 0) {
                start = mid + 1;
            } else if (arr[mid] > 0) {
                end = mid - 1;
            }
        }
        return end;
    }

    public int binarySearchFirstZero(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= 0) {
                end = mid - 1;
            } else if (arr[mid] < 0) {
                start = mid + 1;
            }
        }
        return start;
    }
}