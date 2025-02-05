class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1, ptr2 = n - 1;
        int indexPtr = nums1.length - 1;

        while (ptr2 >= 0) {
            if (ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]) {
                nums1[indexPtr--] = nums1[ptr1--];
            } else {
                nums1[indexPtr--] = nums2[ptr2--];
            }
        }
    }
}