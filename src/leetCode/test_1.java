package leetCode;

/*����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ

����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�

ʾ��:

���� nums = [2, 7, 11, 15], target = 9

��Ϊ nums[0] + nums[1] = 2 + 7 = 9
���Է��� [0, 1]*/


//����˫��ѭ�����ȱ��������һ������������������ӷ����Ŀ��ֵ��Ȼ���ٱ����ڶ���������������������Ƿ����Ŀ��ֵ��
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

