package codeInterview.question6;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }

    class StackSolution {
        public int[] reversePrint(ListNode head) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (! stack.empty()) {
            result.add(stack.pop().val);
        }

        int[] arr = new int[result.size()];
            for(int i = 0; i < result.size(); i++) {
                arr[i] = result.get(i);
            }
        return arr;
        }
}
}
