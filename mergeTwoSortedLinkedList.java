
public class mergeTwoSortedLinkedList {
	
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
    	 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        	 ListNode result = new ListNode(0);
        	 ListNode result1 = result;
             while (null != list1 && null != list2) {

            	 if(list1.val<= list2.val) {
            		 result.next = list1;
            		 list1= list1.next;
            	 }
            	 else {
            		 result.next = list2;
            		 list2= list2.next;
            	 }
                 result = result.next;
             }
             result.next = (list1!=null) ?list1 : list2;
             return result1.next;
    }
     public static void main(String[] args) {
    	 ListNode list1 = new ListNode(1);
    	 list1.next = new ListNode(2);
    	 list1.next.next= new ListNode(4);
    	 ListNode list2 = new ListNode(1);
    	 list2.next = new ListNode(3);
    	 list2.next.next= new ListNode(4);
    	 ListNode n = mergeTwoLists(list1,list2);
    	 while (n != null) {
    		 System.out.println(n.val);
    		 n=n.next;
    	 }
    	 
     }

}
