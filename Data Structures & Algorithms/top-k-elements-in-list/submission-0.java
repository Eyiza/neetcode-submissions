class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] frequent = new int[k];
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
         
        // System.out.print(frequency);
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> frequency.get(a) - frequency.get(b)
        );

        for (int num : frequency.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); 
            }
        }

        int i = 0;
        while (!heap.isEmpty()) {
            frequent[i++] = heap.poll();
        }

        return frequent;
    }
}
