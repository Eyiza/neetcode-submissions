class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxSequence = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        while(right < s.length()){
            char s_char = s.charAt(right);
            if (lastSeen.containsKey(s_char) && lastSeen.get(s_char) >= left) {
                left = lastSeen.get(s_char) + 1;
            } 
            lastSeen.put(s_char, right); 
            maxSequence = Math.max(maxSequence, right - left + 1);

            right++;
        }
        // System.out.print(lastSeen);

        return maxSequence;
        
    }
}
