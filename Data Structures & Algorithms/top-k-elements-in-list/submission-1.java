class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] frequent = new int[k];
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
         
        // System.out.print(frequency);
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : frequency.keySet()) {
            int freq = frequency.get(num);
            if (bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
        }

        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--){
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    frequent[index] = num;
                    if (index == k) break;
                    index++;
                }
            }
        }

        return frequent;
    }
}
