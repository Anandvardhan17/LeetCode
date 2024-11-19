class rotateLinkedList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
    public ListNode rotateRight(ListNode prev, int k) {
    if (prev == null || k<=0 || prev.next == null){
        return prev;
    }
    int length = 2;
    ListNode last = prev.next;
     while (last.next != null){
        last = last.next;
        length++;
     }
     last.next = prev;
     int rotations = k% length;
     int skip = length - rotations;
     ListNode newLast = prev;
     for(int i = 1 ; i< skip ; i++){
         newLast = newLast.next;
     }
      prev = newLast.next ;
      newLast.next= null;
      return prev;

}
}