class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode temp3;

        int length = 0;

        while (temp1 != null) {
            temp1 = temp1.next;
            length++;
        }

        // If the head has to be removed
        if (n == length) {
            return head.next;
        }

        int i = 1;
        while (i < (length - n)) {
            temp2 = temp2.next;
            i++;
        }

        temp3 = temp2.next;
        temp2.next = temp3.next;
        temp3.next = null;

        return head;
    }
}
