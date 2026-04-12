class Solution:
    def minOperations(self, logs: List[str]) -> int:
        if len(logs) == 0: return 0
        stack = []
        
        for operation in logs:
            if operation == "../":
                if stack: stack.pop()               
            elif operation == "./":
                continue
            else:
                stack.append(operation)
        return len(stack)
        