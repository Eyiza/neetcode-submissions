class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] sw_max = new int[n - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        int left = 0;

        for (int right = 0; right < n; right++){
            while(queue.peekLast() != null && queue.peekLast() < nums[right]) queue.removeLast();

            queue.addLast(nums[right]);
            if (right - left + 1 == k) {
                int val = queue.peekFirst();
                sw_max[left] = val;
                if (val == nums[left]) queue.removeFirst();
                left += 1;
            }
        }

        return sw_max;
    }
}
