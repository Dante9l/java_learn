package leet;

import java.math.BigInteger;

public class B_plusLinkedList {
    public _ListNode addTwoNumbers(_ListNode l1, _ListNode l2) {
    String a = reverse(l1);
    String b = reverse(l2);

    BigInteger num1 = new BigInteger(a);
    BigInteger num2 = new BigInteger(b);
    BigInteger num3 = num1.add(num2);

    String sumString = num3.toString();

    _ListNode head = null;
    _ListNode link = null;
        for(int i =sumString.length() - 1;i >= 0;i--){
        int dig = Character.getNumericValue(sumString.charAt(i));
        _ListNode newNode = new _ListNode(dig);

        if(head == null){
            head = newNode;
            link = head;
        }else{
            link.next = newNode;
            link = link.next;
        }
    }
        return head;
}
    public String reverse(_ListNode node){
        StringBuilder sb = new StringBuilder();
    // 逆序添加节点值
        while (node != null) {
            sb.insert(0, node.val); // 将当前节点的值插入到开头
            node = node.next; // 移动到下一个节点
        }
        return sb.toString(); // 返回拼接后的字符串
    }
}
