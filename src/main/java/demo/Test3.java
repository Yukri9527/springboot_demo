package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class Test3 {

	public static void main(String[] args) {

//		int arrays[] = { 1, 1, 2, 3, 5, 8, 5 };
//		int arr[] = isRepeat(arrays);
//		printArr(arr);
//		printNarcissisticNumber();
		tagUser();

	}

	private static void printArr(int[] arr) {
		for (int i : arr) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static int[] isRepeat(int[] arrays) {
		// 找到数组中重复的数字并返回例如传入[1,2,2,3,5,8,5]
		int[] arr = new int[arrays.length];
		int tags = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[i] == arrays[j]) {
					arr[tags] = arrays[i];
					tags++;
					break;
				}
			}
		}
		return arr;
	}

	public static void printNarcissisticNumber() {
		int a = 0;
		int b = 0, b1 = 0;
		int c = 0;
		for (int i = 100; i < 1000; i++) {
			a = i % 10; // 个
			b1 = i / 10;
			b = b1 % 10; // 十
			c = b1 / 10; // 百
			if (i == a * a * a + b * b * b + c * c * c) {// 水仙花数判断
				System.out.print(i + " ");
			}
		}
	}

	private static void tagUser() {
		// books 初始化
		Map<String, List<String>> books = new HashMap<String, List<String>>();
		books.put("呼吸", Lists.newArrayList("科幻", "美国文学"));
		books.put("时间的秩序", Lists.newArrayList("哲学", "物理", "社会学", "科学"));
		books.put("归训与惩罚", Lists.newArrayList("社会学", "哲学", "历史"));
		books.put("时间与他者", Lists.newArrayList("哲学"));
		books.put("杀死一只知更鸟", Lists.newArrayList("成长", "教育", "美国文学"));
		books.put("坏血", Lists.newArrayList("商业", "纪实", "美国文学", "科技"));
		books.put("枪炮、病菌与钢铁", Lists.newArrayList("人类学", "历史", "社会学"));
		// User 初始化
		Map<String, List<String>> users = new HashMap<String, List<String>>();
		users.put("Tom", Lists.newArrayList("呼吸", "杀死一只知更鸟"));
		users.put("Jerry", Lists.newArrayList("坏血", "呼吸", "时间与他者", "时间的秩序"));
		users.put("rick", Lists.newArrayList("枪炮、病菌与钢铁", "归训与惩罚", "时间的秩序"));
		users.put("morty", Lists.newArrayList("杀死一只知更鸟"));

		// Result 初始化
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		for (String userName : users.keySet()) {
			List<String> userBookList = users.get(userName);
			Map<String, Integer> bookTagCount = new HashMap<String, Integer>();
			int max = 1;
			for (String bookName : userBookList) {
				List<String> bookTags = books.get(bookName);
				for (String tag : bookTags) {
					if (bookTagCount.containsKey(tag)) {
						int newCount = bookTagCount.get(tag) + 1;
						if (newCount > max) {
							max = newCount;
						}
						bookTagCount.put(tag, newCount);
					} else {
						bookTagCount.put(tag, 1);
					}
				}
			}
//			System.out.println(userName+" "+max);
			List<String> userTags = new ArrayList<>();
			for (String tag : bookTagCount.keySet()) {
//				System.out.print(tag + "：" + bookTagCount.get(tag));
				if (bookTagCount.get(tag) == max) {
					userTags.add(tag);
				}
			}
//			System.out.println();
			result.put(userName, userTags);
		}

		// 遍历map<key,value>
		for (String key : result.keySet()) {
			List<String> tags = result.get(key);
			// 引入guava后
			System.out.println(key + " : " + Joiner.on("/").join(tags));
		}

	}

}
