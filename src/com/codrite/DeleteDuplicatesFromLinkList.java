package com.codrite;

public class DeleteDuplicatesFromLinkList {

    public static void main(String[] args) {
        // case 1 - [1,1]
        System.out.println(deleteDuplicates(textCase1(1,1)));
        // case 2 - [1,2]
        ListNode list = deleteDuplicates(textCase1(1,2));
        while(list != null){
            System.out.print(list.val + " ");
            list = list.next;
        }
        // case 3 - [1,1,2]
        list = deleteDuplicates(textCase2(1,1, 2));
        while(list != null){
            System.out.print(list.val + " ");
            list = list.next;
        }
    }

    static ListNode textCase1(int a, int b){
        ListNode one = new ListNode(a);
        one.next = new ListNode(b);
        return one;
    }

    static ListNode textCase2(int a, int b, int c){
        ListNode one = new ListNode(a);
        one.next = new ListNode(b);
        one.next.next = new ListNode(c);
        return one;
    }

    static ListNode deleteDuplicates(ListNode head){
        ListNode start = head;
        ListNode next = start.next;

        ListNode prev = null;
        while(start != null && next != null && start.val == next.val){
            start = next;
            next = next.next;
        }

        return start;
    }

    static class ListNode {
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

}
