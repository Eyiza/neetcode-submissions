class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxConsecutive = 0;

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : numSet) {
            if (!numSet.contains(num - 1)){
                int consecutive = 0;
                while(numSet.contains(num + consecutive)) consecutive++;
                if (consecutive > maxConsecutive) maxConsecutive = consecutive;
            }
        }
        return maxConsecutive;
    }
}
