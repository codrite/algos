package com.codrite;

public class DeleteDuplicatesTest {

    public static void main(String[] args) {
        // case 3 - [1,1,2]
        ListNode list = deleteDuplicates(textCase2(1,1, 3,3,4));
        while(list != null){
            System.out.print(list.val + " ");
            list = list.next;
        }
    }

    static ListNode textCase2(int a, int b, int c, int d, int e){
        ListNode one = new ListNode(a);
        one.next = new ListNode(b);
        one.next.next = new ListNode(c);
        one.next.next.next = new ListNode(d);
        one.next.next.next.next = new ListNode(e);
        return one;
    }

    static public ListNode deleteDuplicates(ListNode head) {
         if(head == null || head.next == null)
             return head;

         ListNode saved = head;
         int node = findDuplicate(saved);
         while(node > -1){
             ListNode temp = delete(saved, node);
             node = findDuplicate(temp);
             if(node == -1 && temp != null) {
                 saved = temp;
                 break;
             } else if(node > -1 && temp != null) {
                 saved = temp;
             } else if(node == -1){
                 saved = temp;
             }
         }

         return saved;
    }

    // 1->2->3
    static public int findDuplicate(ListNode listNode){
        ListNode head = listNode;
        while(head != null && head.next != null){
            if(head.val == head.next.val)
                return head.val;
            else
                head = head.next;
        }
        return -1;
    }

    // 1->1
    // 1->2->2->3 - 2
    // 1->1->2->3 - 1
    // 1->2->3->3 - 3
    static public ListNode delete(ListNode head, int element){
        ListNode l = head;
        ListNode p = head;
        ListNode prev = null;
        while(l != null && l.val != element){
            prev = l;
            l = l.next;
        }
        ListNode d = l;
        while(d != null && d.val == element){
            d = d.next;
        }
        if(prev != null) {
            l = prev;
            if (l.next != null)
                l.next = d;
        }
        p.next = l;
        return p;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
