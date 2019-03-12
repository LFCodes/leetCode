package leetCode;

/*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]*/


//采用双层循环，先遍历数组第一个数与数组其他数相加否等于目标值，然后再遍历第二个数与数组其他数相加是否等于目标值，
public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int[20];
		int [] num = {2,7,11,15};
		int target = 9;
		for (int i = 0;i < num.length;i++)
			for (int j = i + 1; j < num.length;j++) {
				if (num[i] + num[j] == target) {
					System.out.println(i + "....." + j);
					break;
				}
					
			}
	}

}

