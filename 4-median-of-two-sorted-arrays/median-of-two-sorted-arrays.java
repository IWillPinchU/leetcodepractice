class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] joined = new int[nums1.length + nums2.length];

        for(int i = 0; i<nums1.length; i++){
            joined[i] = nums1[i];
        }

        for(int i = nums1.length, j = 0; i<joined.length; i++, j++){
            joined[i] = nums2[j];
        }

        Arrays.sort(joined);
        
        if(joined.length % 2 == 0){
            return (double) (joined[(joined.length/2) - 1] + joined[joined.length/2]) / 2;
        }
        else return joined[joined.length/2];
    }
}