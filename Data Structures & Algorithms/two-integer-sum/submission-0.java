class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int otherNum = target - num;
            if (seen.get(otherNum) != null) {
                return new int[]{seen.get(otherNum), i};
            }
            seen.put(num, i);
        }
        return new int[2];
    }
}
