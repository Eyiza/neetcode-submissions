class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products_left = new int[nums.length];

        products_left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            products_left[i] = products_left[i - 1] * nums[i - 1];
        }

        int products_right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products_left[i] *= products_right;
            products_right *= nums[i];
        }

        return products_left;
    }
}  
