package leet;

public class S_deleteNode {
    public _ListNode removeNthFromEnd(_ListNode head, int n){
        return remove(head, n) == n ? head.next : head;
    }
    private int remove(_ListNode cur, int n) {
        if (cur == null) return 0;

        int count = remove(cur.next, n) + 1;

        if (count == n + 1) cur.next = cur.next.next;

        return count;
    }
}
