import heapq 
import math

class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        k_closest = []
        x1, y1 = 0, 0

        for (x2, y2) in points:
            x, y = (x1 - x2)**2, (y1 - y2)**2
            dist = math.sqrt(abs(x + y))
            heapq.heappush(k_closest, (dist, [x2,y2]))

        return [heapq.heappop(k_closest)[1] for i in range(k)]
            
        