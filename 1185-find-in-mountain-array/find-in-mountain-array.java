/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBSByParam(mountainArr, target, 0, peakIndex);
        if (firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBSByParam(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
    }
    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public int orderAgnosticBSByParam(MountainArray mountainArr, int target, int low, int high) {

    boolean isAscending = mountainArr.get(low) < mountainArr.get(high);

    int mid = (low + high) / 2;
    if (mountainArr.get(mid) == target) return mid;
    if (mountainArr.get(low) == target) return low;
    if (mountainArr.get(high) == target) return high;

    if (isAscending) {
        while (low <= high) {
            mid = (low + high) / 2;
            if (target > mountainArr.get(mid)) {
                low = mid + 1;
            } else if (target < mountainArr.get(mid)) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    } else {
        while (low <= high) {
            mid = (low + high) / 2;
            if (target > mountainArr.get(mid)) {
                high = mid - 1;
            } else if (target < mountainArr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

}

