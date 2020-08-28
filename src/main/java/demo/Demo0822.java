package demo;

public class Demo0822 {

	public static void main(String[] args) {
//		int[] arr1 = { 1, 3, 4, 6, 9 };
//		int[] arr2 = { 1, 3, 3, 4, 6, 9 };
//		int target = searchInsert(arr1, 5);
//		int length = removeDuplicates(arr2);
//		System.out.println(target);
//		System.out.println(length);
//		
////		for (int i : arr2) {
////			System.out.print(i);
////		}
//		for (int i = 0; i < length; i++) {
//			System.out.print(arr2[i]);
//		}

		printYHSJ(5);
		System.out.println();
		String str= "hello world fine thank you and you";
		int[] result= {};
		result=countWord(str);
		for(int i:result) {
			System.out.print(i+" ");
		}

	}

	private static int searchInsert(int[] nums, int target) {
		// 给定数组[1,3,4,6,9]
		// 输入target 4
		// 返回target 下标 2

		// case2 输入target 5 输入下标3 从小到大
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if(nums[i])
//			}
			if (nums[i] == target) {
				index = i;
			}
			if (i == nums.length - 1) {
				for (int j = i; j >= 0; j--) {
					if (target < nums[j] && target > nums[j - 1] && j - 1 >= 0) {
						index = j - 1;
					}
				}
			}
		}
		return index;

	}

	private static int removeDuplicates(int[] nums) {
		// 不允许使用辅助数组
		// 给定数组[1,3,3,4,6,9] 且原数组前5个数组修改为【1，3，4，6，9】
//		int length = nums.length;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					nums[j] = 0;
//					length--;
//				}
//			}
//		}
//		for (int m = 0; m < nums.length; m++) {
//			if (nums[m] == 0 && m + 1 < nums.length) {
//				for (int n = m; n < nums.length - 1; n++) {
//					nums[n] = nums[n + 1];
//				}
//			}
//
//		}
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				nums[i + 1] = nums[j];
				i++;
			}
		}
		return i + 1;

	}

	private static void printYHSJ(int height) {

		int arr[][] = new int[height][];
		for (int i = 0; i < arr.length; i++) {
			// 确定二维数组元素的大小
			arr[i] = new int[i + 1];
			// 打印数字前的空格
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || arr[i].length - 1 == j) {
					arr[i][j] = 1;// 三角形两腰为 1
				} else {
					// 其他元素等于两肩数字之和
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	private static int[] countWord(String str) {
		
		String[] str_list=str.split(" ");
		int[] result=new int[str_list.length];
		for(int i=0; i<result.length;i++) {
			result[i]=str_list[i].length();
		}
		return result;
	}
}
