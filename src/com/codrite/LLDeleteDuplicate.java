package com.codrite;

public class LLDeleteDuplicate {

    public static void main(String[] args) {

    }

    static public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prevCurr, curr = head, next = head.next;
        if(curr.val == next.val){
            while(curr != null && next != null && curr.val == next.val){
                curr = curr.next;
                next = next.next;
            }
            prevCurr = deleteDuplicates(next);
        } else {
            prevCurr = curr;
            prevCurr.next = deleteDuplicates(next);
        }

        return prevCurr;
    }

}
