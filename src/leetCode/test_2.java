package leetCode;

/*�������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�

��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�

�����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��

ʾ����

���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
�����7 -> 0 -> 8
ԭ��342 + 465 = 807*/

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
//���ý�λ��־ flag  ��������ֵ��� ������9 ���1

//1�����������Ȳ�һ��

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
    		int a = (l1 != null)?l1.num:0;					//��Ԫ�����
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

