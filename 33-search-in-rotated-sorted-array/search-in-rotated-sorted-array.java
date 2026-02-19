class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1) return binarySearch(nums,0,nums.length - 1,target);
        if(nums[pivot]==target) return pivot;
        int ans = binarySearch(nums,0,pivot-1,target);
        if (ans != -1) return ans;
        return binarySearch(nums,pivot+1,nums.length - 1,target);
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if (mid<end && nums[mid] > nums[mid+1]) return mid;
            if (mid>start && nums[mid] < nums[mid-1]) return mid-1;
            if (nums[start] >= nums[mid]) end=mid-1;
            else start = mid + 1;
        }
        return -1;
    }
    public int binarySearch(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}