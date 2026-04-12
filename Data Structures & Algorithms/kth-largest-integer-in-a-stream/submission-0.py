import heapq

class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.stream_heap = nums
        heapq.heapify(self.stream_heap)

        while len(self.stream_heap) > k:
            heapq.heappop(self.stream_heap)
        

    def add(self, val: int) -> int:
        heapq.heappush(self.stream_heap, val)
        while len(self.stream_heap) > self.k:
            heapq.heappop(self.stream_heap)

        return self.stream_heap[0]
        
