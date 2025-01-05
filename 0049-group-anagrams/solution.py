from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        anagrams_map=defaultdict(list)
        result=[]

        for s in strs:
            sorted_s=tuple(sorted(s))
            anagrams_map[sorted_s].append(s)

         

        for values in anagrams_map.values():
            result.append(values)

        return result    

     
        
