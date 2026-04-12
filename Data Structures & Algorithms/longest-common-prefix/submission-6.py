class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix_map = {}
        n = len(strs)
        if n == 1: return strs[0]
        for string in strs:
            i, j = 0, len(string)
            prefix = ""
            while i < j:
                prefix += string[i]
                prefix_map[prefix] = prefix_map.get(prefix, 0) + 1
                i += 1
        if len(prefix_map) == 0: return ""
        max_prefix = max(prefix_map.values())
        if max_prefix != n: return ""

        prefixes = set()
        for prefix in prefix_map:
            if prefix_map[prefix] == max_prefix:
                prefixes.add(prefix)
        return max(prefixes)
        
            
        