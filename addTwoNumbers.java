/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
// initializing the result linked list
        ListNode resultNode = new ListNode(0);
        ListNode resultTraverse = resultNode;
        int carry = 0;
        
// traversing through the entire linked list
        while(l1 != null || l2 != null){
            
// checking if there exist a number in the linked list if so assiging it to a new variable else assigning 0
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            
            int sum = val1 + val2 + carry;
            if(sum > 9){
//  If the sum is greater than 9 separate the carry and the remainder                
                int remainder = sum % 10;
                carry = sum / 10;
                ListNode node = new ListNode(remainder);
                resultTraverse.next = node;
            }
// If the sum is less than 9 add it to the result node
            else {
                carry = 0;
                ListNode node = new ListNode(sum);
                resultTraverse.next = node;
            }
            
            resultTraverse = resultTraverse.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
// If there is carry at the end append to the result]]
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            resultTraverse.next = node;
        }
        return resultNode.next;
    }
}
