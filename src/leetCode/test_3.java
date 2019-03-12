package leetCode;
import java.util.HashSet;
import java.util.Set;

/*����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�

ʾ�� 1:

����: "abcabcbb"
���: 3 
����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
ʾ�� 2:

����: "bbbbb"
���: 1
����: ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1��
ʾ�� 3:

����: "pwwkew"
���: 3
����: ��Ϊ���ظ��ַ�����Ӵ��� "wke"�������䳤��Ϊ 3��
     ��ע�⣬��Ĵ𰸱����� �Ӵ� �ĳ��ȣ�"pwke" ��һ�������У������Ӵ���*/

public class test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		Solution1  solution = new Solution1();
		System.out.println(solution.lengthOfLongestSubstring(s));
//		String ss = "";
//		if(ss.length() == 0)
//			System.out.println(ss.length());
	}

}


class Solution1 {
    public int lengthOfLongestSubstring(String s) {
    	int max = 1;
    	//���������Ӵ�
    	if (s.length() == 0)
    		max = 0;
    	else {
    	for (int i = 0; i < s.length();i++)
    		for (int j = i + 1; j < s.length();j++) {
    			max = (check(s,i,j) && j - i + 1 > max) ? j - i + 1:max;
    		}}
    	return max;
    }
    //����Ӵ��Ƿ���������
    public boolean check(String s,int i,int j) {
    	Set<Character> set = new HashSet<>();
    	char[] arr = s.toCharArray();
    	boolean flag = true;
    	for (int k = i;k <= j;k++) {
    		if (set.contains(arr[k])) {
    			flag = false;break;
    		}else {
    			
    			set.add(arr[k]);
    		}
    	}
     	return flag ;
    }
}