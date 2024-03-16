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
    public int numComponents(ListNode head, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,null);
        }
        
        int count = 0;
        ListNode prev, current;
        prev = null;
        current = head;

        while(current != null){
            if(map.containsKey(current.val)){
                if(prev == null){
                    count++;
                }
                else if(prev != null && !map.containsKey(prev.val)){
                    count++;
                }
            }
            prev = current;
            current = current.next;
        }
        return count;
    }
}