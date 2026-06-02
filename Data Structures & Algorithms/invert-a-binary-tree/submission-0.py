# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root: return
        
        dummy = TreeNode(root.val, root.right, root.left)
        # print(dummy.val, dummy.left.val)
        stack = []
        if dummy.left: stack.append(dummy.left)
        if dummy.right: stack.append(dummy.right)

        # stack = [3, 2, ]
        while stack:
            pop = stack.pop()
            if pop.left: stack.append(pop.left)
            if pop.right: stack.append(pop.right)
            
            pop.left, pop.right = pop.right, pop.left


        return dummy
        