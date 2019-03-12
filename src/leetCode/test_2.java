package leetCode;

/*给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807*/

class ListNode{
	int num;
	ListNode next;
	ListNode(int x){
		num = x;
	}
}
public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(5);
		
		ListNode l2 = new ListNode(6);
//		System.out.println(l1.num);
//		System.out.println(l2.num);
		Solution s = new Solution();
		ListNode list = s.addTwoNumbers(l1, l2);
		System.out.println(list.num );
		System.out.println(list.next.num );

	}

}
//设置进位标志 flag  两个链表值相加 若大于9 则进1

//1、两个链表长度不一样

/*class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode list = new ListNode(10);
       int flag = 0;
       if (l1 != null && l2 != null) {
    	   if ((l1.num + l2.num) > 9) {
    		   flag = 1;
    		   list.num = (l1.num + l2.num) % 10;
    		   list.next.num = list.next.num + 1;
    		   
    	   }else {
    		   list.num = l1.num + l2.num;
    	   }
    	   l1 = l1.next;
    	   l2 = l2.next;
    	   list = list.next;
    	 }
       if(l1 == null && l2 != null) {
    	   list.num = l2.num;
    	   list = list.next;
    	   l2 = l2.next;
       }else if (l2 == null && l1 != null){
    	   list.num = l1.num;
    	   l1 = l1.next;
    	   list = list.next;
       }else {	         
    	   
        } 
       return list;
    }
}*/


class Solution {
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode list = new ListNode(0);
    	int flag = 0;
    	while (l1 != null || l2 != null) {
    		int a = (l1 != null)?l1.num:0;					//三元运算符
    		int b = (l2 != null)?l2.num:0;
    		
    		int sum = a + b + flag;
    		list.next = new ListNode(sum % 10);
    		flag = sum / 10;


    		if (l1 != null)l1 = l1.next;
    		if (l2 != null)l2 = l2.next;
    		list = list.next;
    		
    		
    	}
    	if (flag > 0) {
    			list.next = new ListNode(flag);
    		}
    	return list;
    	}
    	
    }

