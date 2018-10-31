package leetcode;

public class leetcode21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1==null&&l2==null){
			return null;
		}
		int init=0;
		if(l1==null){
			init=l2.val;
			l2=l2.next;
		}else if(l2==null){
			init=l1.val;
			l1=l1.next;
		}else{
			if(l1.val<l2.val){
				init=l1.val;
				l1=l1.next;
			}else{
				init=l2.val;
				l2=l2.next;
			}
		}
		ListNode jieguo=new ListNode(init);
		ListNode zhong=new ListNode(0);
		zhong=jieguo;
		while(true){
			int temp;
			if(l1!=null&&l2!=null){
				if(l1.val<l2.val){
					temp=l1.val;
					l1=l1.next;
					
				}else{
					temp=l2.val;
					l2=l2.next;
				}
				ListNode tempnode=new ListNode(temp);
				zhong.next=tempnode;
				zhong=tempnode;
			}else if(l1==null&&l2!=null){
				temp=l2.val;
				l2=l2.next;
				ListNode tempnode=new ListNode(temp);
				zhong.next=tempnode;
				zhong=tempnode;
			}else if(l1!=null&&l2==null){
				temp=l1.val;
				l1=l1.next;
				ListNode tempnode=new ListNode(temp);
				zhong.next=tempnode;
				zhong=tempnode;
			}else{
				break;
			}
			
		}
		
		
		return jieguo;
	}
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	 }

}
