package leetCode;
import java.util.HashSet;
import java.util.Set;

/*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/

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
    	//遍历所有子串
    	if (s.length() == 0)
    		max = 0;
    	else {
    	for (int i = 0; i < s.length();i++)
    		for (int j = i + 1; j < s.length();j++) {
    			max = (check(s,i,j) && j - i + 1 > max) ? j - i + 1:max;
    		}}
    	return max;
    }
    //检查子串是否满足条件
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