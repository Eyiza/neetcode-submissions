class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int left = 0;

        for (int right = 0; right < nums.length; right++){
            while (queue.peekLast() != null && nums[right] > queue.peekLast()) queue.pollLast();
            queue.addLast(nums[right]);

            if (right - left + 1 == k) {
                result[left] = queue.peekFirst();
                if (queue.peekFirst() == nums[left]) queue.pollFirst();
                left++;
            }
        }
        
        return result;
    }
}
