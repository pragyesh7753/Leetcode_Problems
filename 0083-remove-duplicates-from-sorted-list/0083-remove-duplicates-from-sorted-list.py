# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head

        # Traverse the linked list
        while current and current.next:
            if current.val == current.next.val:
                # If the current node's value is equal to the next node's value,
                # skip the next node by pointing current's next to the node after next
                current.next = current.next.next
            else:
                # If the values are not equal, move to the next node
                current = current.next
        return head  # Return the updated head