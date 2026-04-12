class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        if len(strs) == 1: return [strs]
        for string in strs:
            count = [0] * 26
            for char in string:
                count[ord(char) - ord('a')] += 1
            # print(count)
            key = tuple(count)
            anagrams.setdefault(key, []).append(string)

        # print(anagrams)
        return list(anagrams.values())
        