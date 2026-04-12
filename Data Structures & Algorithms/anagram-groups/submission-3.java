class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : strs){
            int[] alphabets = new int[26];
            for (int i = 0; i < word.length(); i++) {
                int index = (int) word.charAt(i) - 'a'; 
                alphabets[index] ++;
            }
            String key = Arrays.toString(alphabets);
            // System.out.print(key);

            if (!anagrams.containsKey(key)) anagrams.put(key, new ArrayList<>());
            anagrams.get(key).add(word);
        }

        return new ArrayList<>(anagrams.values());
    }
}
