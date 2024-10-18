package leet;

public class U_mergeTowLists {
    public _ListNode mergeTwoLists(_ListNode list1, _ListNode list2){
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        _ListNode target = new _ListNode();
        _ListNode head = target;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                target.next = list1;
                list1 = list1.next;
            }else {
                target.next = list2;
                list2 = list2.next;
            }
            target = target.next;
        }

        if (list1 != null)
            target.next = list1;
        else if (list2 != null)
            target.next = list2;

        return head.next;
    }
}
