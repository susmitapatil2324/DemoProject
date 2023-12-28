class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        if (nums == null || nums.length < 2 || indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long currentElement = nums[i];

            // Check if there is a number in the set with a difference less than or equal to valueDiff
            Long floor = set.floor(currentElement);
            
            if (floor != null && currentElement - floor <= valueDiff) {
                return true;
            }

            Long ceiling = set.ceiling(currentElement);
            if (ceiling != null && ceiling - currentElement <= valueDiff) {
                return true;
            }

            // Add the current element to the set
            set.add(currentElement);

            // Remove the element that is outside the window of size indexDiff
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}