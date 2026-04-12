class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        if len(strs) == 1: return [strs]
        for string in strs:
            str_sort = ''.join(sorted(string))
            if str_sort in anagrams:
                anagrams[str_sort].append(string)
            else:
                anagrams[str_sort] = [string]
        # print(anagrams)
        return list(anagrams.values())
        