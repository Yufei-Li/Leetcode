package codeInterview.question3;

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode dummy1 = new ListNode(-1), p1 = dummy1;
        ListNode dummy2 = new ListNode(-1), p2 = dummy2;
        
        while(p != null){
            if (p.val < x){
                p1.next = p;
                p1 = p1. next;
            }else{
                p2.next = p;
                p2 = p2.next;
            }
            // ListNode temp = p.next;
            // p.next = null;
            p = p.next;
        }
        
        p1.next = dummy2.next;
        return dummy1.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(solution.partition(listNode1, 2).val);
    }
}