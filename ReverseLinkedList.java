
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode present = head;
        ListNode last = head.next;
        while(last !=null){
            present.next = last.next;
            last.next = prev.next;
            prev.next= last;
            last = present.next;
        }
        return prev.next;
    }
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
