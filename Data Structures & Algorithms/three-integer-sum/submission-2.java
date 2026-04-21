class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i < n; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int target = 0 - nums[i];
            int left = i+1;
            int right = n-1;
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    while (nums[left] == nums[left-1] && left < right) left++;
                    continue;
                } else if (sum > target) right--;
                else left++;
                
            }

        }
        return result;
    }
}
