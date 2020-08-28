package com.edu.test;

public class Demo0823 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 3, 1 };
		int[] nums2 = { 2, 3, 4, 5 };

		int[] nums3 = mixArray(nums1, nums2);
		int[] nums4 = mixArray(nums3, nums2);
		for (int i : nums3) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		for (int i : nums4) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}

	}

//	private static void print(int[] nums3) {
//		for (int i : nums3) {
//			if(i!=0) {
//				System.out.print(i+" ");
//			}
//		}	
//	}

	private static boolean contains(int num, int[] nums) {
		for (int i : nums) {
			if (num == i) {
				return true;
			}
		}
		return false;

	}

	public static int[] mixArray(int[] nums1, int[] nums2) {
		int tag = 1;
		int[] nums3 = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j] && contains(nums1[i], nums3) == false) {
					nums3[tag] = nums1[i];
					tag++;
				}
			}
		}

		return nums3;
	}

	public static String findChildStr(String str) {
		// abcdc 返回一个从左从从右看都一样的字符串
		// ababa
		int len = str.length();
		if (str.length() < 2) {// 结束条件
			return null;
			
			
		} else {
			String[] str1 = str.split("");
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(len - i - 1)) {// 根据字符串的下标得到两个数
					// 不一样的
					String left = findChildStr(str.substring(0, len - 1));
					String right = findChildStr(str.substring(1, len));

					if (null != left && null != right) {
						return left.length() > right.length() ? left : right;
					} else {
						return null != left ? left : right;
					}
				}
			}
		}

		return str;
	}

	public static String findChildStr1(String str) {
		int len = str.length();

		return null;
	}

	public static int judgeStr(String[] str) {
		int tag = 0;
		for (int i = 0, j = str.length - 1; i < str.length / 2 && j > str.length / 2; i++, j--) {
			if (str[i].equals(str[j])) {
			} else {
				tag++;
			}
		}
		if (tag == 0) {
			return 1;
		} else {
			return 0;
		}

	}
}
